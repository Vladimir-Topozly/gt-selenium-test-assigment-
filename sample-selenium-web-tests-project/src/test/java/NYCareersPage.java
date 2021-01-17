import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NYCareersPage extends PageObject{

    @FindBy(xpath="//*[@id=\"main-app-container\"]/div/div/div[1]/div[1]/div[1]/h1")
    private WebElement heading;

    public NYCareersPage(WebDriver driver) {
        super(driver);
    }

    public String getHeadingText(){
        String heading = this.heading.getText();
        return heading;
    }
}
