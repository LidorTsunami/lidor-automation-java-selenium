package tests.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.WebDriverManagerUtil;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeSuite
    public void globalSetUp() {
        driver = WebDriverManagerUtil.initializeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterSuite
    public void globalTearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
