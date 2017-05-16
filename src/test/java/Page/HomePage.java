package Page;

import com.example.config.PageObject;
import org.springframework.beans.factory.annotation.Value;

    @PageObject
    public class HomePage extends Page {

        @Value("${site.url}")
        String url;

        /**
         * Open home page.
         */
        public void getHomePage() {
            driver.get(url);
        }
    }
