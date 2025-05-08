package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.locators.CartPageLocators;

public class CartPage {
    private final WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void removeProductByName(String productName) {
        WebElement removeButton = driver.findElement(CartPageLocators.removeButtonByProductName(productName));
        removeButton.click();
    }

    public CheckoutPage clickCheckout() {
        WebElement checkoutButton = driver.findElement(CartPageLocators.CHECKOUT_BUTTON);
        checkoutButton.click();
        return new CheckoutPage(driver);
    }
}
