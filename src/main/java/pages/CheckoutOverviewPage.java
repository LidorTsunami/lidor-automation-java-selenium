package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.locators.CheckoutOverviewPageLocators;

public class CheckoutOverviewPage extends CheckoutPage {
    private final WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getTotalPrice() {
        WebElement totalPriceElement = driver.findElement(CheckoutOverviewPageLocators.TOTAL_PRICE);
        return totalPriceElement.getText();
    }

    public void clickFinish() {
        WebElement finishButton = driver.findElement(CheckoutOverviewPageLocators.FINISH_BUTTON);
        finishButton.click();
    }
}
