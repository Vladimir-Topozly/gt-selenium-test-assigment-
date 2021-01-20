import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CareersMainPage extends PageObject {
    @FindBy(css = ".box-box.margin-bottom-xs-ng.border-radius-round")
    private WebElement nyImageButton;

    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchField;

    @FindBy(css = "div.box-box.sc-kEYyzF > h1")
    private WebElement positionBox;

    @FindBy(css = "div.box-box.sc-kEYyzF.dwHrpj > p")
    private List<WebElement> locationBox;

    @FindBy(css = ".box-box.sc-eHgmQL > div")
    private WebElement locationsDropDown;

    @FindBy(css = ".box-box.sc-eHgmQL > div > div")
    private WebElement departmentsDropDown;

    @FindBy(css = "div.box-box.header.hidden-xs.flex.box-with-flex.flex-direction-column > h1")
    private WebElement heading;

    @FindBy(css = "body > div.react-tiny-popover-container > section")
    private WebElement optionsContainer;

    @FindBy(css = "div.box-box.sc-cvbbAY.hnBfZS > div > h1")
    private WebElement errorHeading;

    CareersMainPage(WebDriver driver) {
        super(driver);
    }

    void navigateToNYLocations() {
        this.nyImageButton.click();
    }

    void search(String text) {
        this.searchField.click();
        this.searchField.sendKeys(text);
        searchField.click();
        this.searchField.sendKeys(Keys.ENTER);
    }

    String getPositionHeading() {
        return this.positionBox.getText();
    }

    String getPageHeading() {
        return this.heading.getText();
    }

    String getErrorMessageText() {
        return this.errorHeading.getText();
    }

    void selectLocationsDropDown(int optionIndex) {
        this.locationsDropDown.click();
        List<WebElement> options = this.optionsContainer.findElements(By.cssSelector("div"));
        options.get(optionIndex).click();
    }

    ArrayList<String> getAllPositionsLocationList() {
        ArrayList<String> locations = new ArrayList<>();

        for (WebElement aLocationBox : this.locationBox) {
            locations.add(aLocationBox.getText());
        }

        return locations;
    }
}
