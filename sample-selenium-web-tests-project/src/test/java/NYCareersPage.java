import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NYCareersPage extends PageObject{
    @FindBy(css="div.box-box.jobs-header.hidden-xs.sc-jWBwVP > h1")
    private WebElement heading;

    NYCareersPage(WebDriver driver) {
        super(driver);
    }

    String getHeadingText(){
        return this.heading.getText();
    }
}
