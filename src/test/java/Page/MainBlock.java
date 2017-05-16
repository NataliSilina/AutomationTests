package Page;

import com.example.config.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@PageObject
public class MainBlock extends Page {
    @FindBy (how = How.XPATH, using = "html/body/div[3]/div[5]/form/a/img")
    WebElement mainPageButton;
}
