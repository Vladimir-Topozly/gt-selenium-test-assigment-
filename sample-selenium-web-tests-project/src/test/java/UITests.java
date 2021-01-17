import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class UITests extends ApplicationManager {
    private String basicUrl = "https://x.gloat.com/careers/";


    @Test(priority = 0)
    public void navigateToNYCareersPage() {
        careersPage = new CareersMainPage(driver);
        nyPage = new NYCareersPage(driver);

        navigateTo(basicUrl);
        careersPage.viewNYLocation();

        Assert.assertEquals(getURL(), basicUrl + "nyc");
        Assert.assertEquals(nyPage.getHeadingText(), "New York");
    }


    @Test(priority = 1)
    public void searchFunctionalityTest() throws Exception {
        careersPage = new CareersMainPage(driver);

        navigateTo(basicUrl);
        careersPage.search("QA ");
        String positionHeading = careersPage.getPositionHeading();

        Assert.assertEquals(positionHeading, "QA Automation Engineer");
    }

    @Test(priority = 2)
    public void locationsDropDownTest() throws Exception {
        careersPage = new CareersMainPage(driver);

        navigateTo(basicUrl);
        careersPage.selectLocationsDropDown(); //TODO: complete the dropdown selection function

        Thread.sleep(5000);
    }

    @Ignore()
    public void departmentsDropDownTest() throws Exception {
        //TODO: create test for departments dropdown
    }


}
