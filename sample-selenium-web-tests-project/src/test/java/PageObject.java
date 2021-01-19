import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject extends ApplicationManager{

    PageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
