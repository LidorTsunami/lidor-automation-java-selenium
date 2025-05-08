package pages;

import org.openqa.selenium.WebDriver;
import pages.locators.LoginPageLocators;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(LoginPageLocators.USERNAME_FIELD).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(LoginPageLocators.PASSWORD_FIELD).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(LoginPageLocators.LOGIN_BUTTON).click();
    }

    public HomePage login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
        return new HomePage(driver);
    }
}
