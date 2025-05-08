package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import tests.base.BaseTest;
import tests.testdata.TestData;

public class TestSauceDemoE2E extends BaseTest {

    private HomePage homePage;

    @BeforeClass
    public void loginOnceBeforeTestsInThisClass() {
        LoginPage loginPage = new LoginPage(driver);
        homePage = loginPage.login(TestData.USERNAME, TestData.PASSWORD);
    }

    @Test
    public void testAddToCartByProductName() {
        homePage.addToCartByProductName(TestData.PRODUCT_1);
        homePage.addToCartByProductName(TestData.PRODUCT_2);
        homePage.addToCartByProductName(TestData.PRODUCT_3);

        CartPage cartPage = homePage.goToCart();
        cartPage.removeProductByName(TestData.PRODUCT_3);

        CheckoutPage checkoutPage = cartPage.clickCheckout();
        CheckoutOverviewPage checkoutOverviewPage = checkoutPage.fillCheckoutFormAndContinue(
                TestData.FIRST_NAME, TestData.LAST_NAME, TestData.ZIP_CODE
        );

        String totalPrice = checkoutOverviewPage.getTotalPrice();
        System.out.println("Total price: " + totalPrice);

        checkoutOverviewPage.clickFinish();
    }
}
