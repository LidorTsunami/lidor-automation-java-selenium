package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.locators.CheckoutPageLocators;

public class CheckoutPage {
    private final WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        WebElement firstNameField = driver.findElement(CheckoutPageLocators.FIRST_NAME_FIELD);
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        WebElement lastNameField = driver.findElement(CheckoutPageLocators.LAST_NAME_FIELD);
        lastNameField.sendKeys(lastName);
    }

    public void enterZipCode(String zipCode) {
        WebElement zipCodeField = driver.findElement(CheckoutPageLocators.ZIP_CODE_FIELD);
        zipCodeField.sendKeys(zipCode);
    }

    public void fillCheckoutForm(String firstName, String lastName, String zipCode) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterZipCode(zipCode);
    }

    public CheckoutOverviewPage clickContinue() {
        WebElement continueButton = driver.findElement(CheckoutPageLocators.CONTINUE_BUTTON);
        continueButton.click();
        return new CheckoutOverviewPage(driver);
    }

    public CheckoutOverviewPage fillCheckoutFormAndContinue(String firstName, String lastName, String zipCode) {
        fillCheckoutForm(firstName, lastName, zipCode);
        return clickContinue();
    }
}
