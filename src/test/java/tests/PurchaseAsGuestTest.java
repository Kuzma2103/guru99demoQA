package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LogInPage;
import utilities.PropertyManager;

public class PurchaseAsGuestTest extends BaseTest {

    public LogInPage logInPage;
    public CheckoutPage checkoutPage;
    public HomePage homePage;

    @Test
    public void purchaseAsGuest() {
        logInPage = new LogInPage(driver);
        checkoutPage = new CheckoutPage(driver);
        homePage = new HomePage(driver);

        logInPage.basePage();
        checkoutPage.guestPurchase(PropertyManager.getInstance().getFirstName(),
                PropertyManager.getInstance().getLastName(),
                PropertyManager.getInstance().getEmail(),
                PropertyManager.getInstance().getAddress(),
                PropertyManager.getInstance().getCity(),
                PropertyManager.getInstance().getZip(),
                PropertyManager.getInstance().getTelephone()
        );

        try {
            homePage.verificationGuestPurchase("THANK YOU FOR YOUR PURCHASE!");
            System.out.print("The guest purchase is finished. Everything looks good.");
        } catch (Exception e) {
            Assert.fail("Something went wrong. The test has failed.");
        }
    }

}
