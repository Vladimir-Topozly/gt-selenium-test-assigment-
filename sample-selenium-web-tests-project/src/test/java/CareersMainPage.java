import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersMainPage extends PageObject {

    @FindBy(css = ".box-box.margin-bottom-xs-ng.border-radius-round.object-fit-cover.theme-default")
    private WebElement nyButton;

    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchField;

    @FindBy(css = "div.box-box.sc-kEYyzF.ktWzhX.flex.box-with-flex.padding-right-sm-ng.theme-default > h1")
    private WebElement positionBox;

    @FindBy(css = ".box-box.sc-eHgmQL > div")
    private WebElement locationsDropDown;

    @FindBy(css = ".box-box.sc-eHgmQL > div > div") //TODO: check this locator
    private WebElement departmentsDropDown;

    protected CareersMainPage(WebDriver driver) {
        super(driver);
    }

    protected void viewNYLocation() {
            this.nyButton.click();
    }

    protected void search(String text) {
        this.searchField.click();
        this.searchField.sendKeys(text);
        searchField.click();
        this.searchField.sendKeys(Keys.ENTER);
    }

    public String getPositionHeading(){
        String heading = this.positionBox.getText();
        return heading;
    }

    public void selectLocationsDropDown(){
        this.locationsDropDown.click();
    }


}
