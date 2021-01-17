import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstUiTest {
    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        //driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://x.gloat.com/careers/all");
    }

    @Test
    public void validateGloatWelcomePage() throws Exception {
//        WebElement searchField = driver.findElement(By.cssSelector("input.gLFyf"));
//        searchField.click();
//        searchField.clear();
//        searchField.sendKeys("undernet");
//        searchField.sendKeys(Keys.ENTER);
//
//        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div[1]/a")).click();
//
//        Thread.sleep(5000);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }
}
