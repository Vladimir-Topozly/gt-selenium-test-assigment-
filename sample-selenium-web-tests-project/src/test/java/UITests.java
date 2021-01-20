import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

public class UITests extends ApplicationManager {

    @Test(priority = 0)
    public void openCareersPage() {
        careersPage = new CareersMainPage(driver);

        String heading = careersPage.getPageHeading();

        Assert.assertEquals(heading, "All locations");
    }

    @Test(priority = 1)
    public void navigateToNYCareersPage() {
        careersPage = new CareersMainPage(driver);

        nyPage = new NYCareersPage(driver);

        careersPage.navigateToNYLocations();

        Assert.assertEquals(getURL(), baseUrl + "nyc");

        Assert.assertEquals(nyPage.getHeadingText(), "New York");
    }


    @Test(priority = 3)
    public void searchFunctionalityTest() throws Exception {
        careersPage = new CareersMainPage(driver);

        careersPage.search("QA ");

        String positionHeading = careersPage.getPositionHeading();

        Assert.assertEquals(positionHeading, "QA Automation Engineer");
    }

    @Test(priority = 4)
    public void searchFunctionalityNegativeTest() {
        careersPage = new CareersMainPage(driver);

        String expectedErrorMessage = "No results matching your search!";

        careersPage.search("dmldsnkfnkkn");

        String actualErrorMessage = careersPage.getErrorMessageText();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    @Test(priority = 5)
    public void locationsDropDownTest() throws Exception {
        careersPage = new CareersMainPage(driver);

        careersPage.selectLocationsDropDown(1);

        IntStream.range(0, careersPage.getAllPositionsLocationList().size()).forEach(i ->
                Assert.assertEquals(careersPage.getAllPositionsLocationList().get(i),
                        "New York, NY, USA"));
    }
}
