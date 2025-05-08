package pages.locators;

import org.openqa.selenium.By;

public class HomePageLocators {
    public static final By CART_ICON = By.id("shopping_cart_container");

    public static By addToCartButtonByProductName(String productName) {
        return By.xpath("//*[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button[text()='Add to cart']");
    }
}
