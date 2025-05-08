package pages.locators;

import org.openqa.selenium.By;

public class CartPageLocators {
    public static By removeButtonByProductName(String productName) {
        return By.xpath("//*[text()='" + productName + "']/ancestor::div[@class='cart_item']//button[text()='Remove']");
    }
    public static final By CHECKOUT_BUTTON = By.id("checkout");
}
