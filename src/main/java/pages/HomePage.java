package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.locators.HomePageLocators;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCartByProductName(String productName) {
        WebElement button = driver.findElement(HomePageLocators.addToCartButtonByProductName(productName));
        button.click();
    }

    public CartPage goToCart() {
        driver.findElement(HomePageLocators.CART_ICON).click();
        return new CartPage(driver);
    }
}
