package Page;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Page {

    @Autowired
    protected WebDriver driver;

}
