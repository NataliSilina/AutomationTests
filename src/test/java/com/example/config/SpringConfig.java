package com.example.config;

import com.example.util.PropertyLoader;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import ru.stqa.selenium.factory.WebDriverPool;

import java.io.IOException;

@Configuration
@ComponentScan("com.example")
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Bean(destroyMethod = "quit")
    public WebDriver driver() throws IOException {
        System.setProperty("webdriver.chrome.driver", System.getenv("webdriver.chrome.driver"));
        Capabilities capabilities = PropertyLoader.loadCapabilities();
        return WebDriverPool.DEFAULT.getDriver(capabilities);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}