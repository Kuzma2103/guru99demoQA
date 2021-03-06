package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.CheckoutPage;
import pages.VerificationPage;

import java.util.ArrayList;

public class PurchaseAsGuestTest extends BaseTest {

    public CheckoutPage checkoutPage;
    public VerificationPage verificationPage;
    ArrayList<String> userData = new ArrayList<>();

    @Test
    public void purchaseAsGuest() {

        checkoutPage = new CheckoutPage(driver);
        verificationPage = new VerificationPage(driver);

        checkoutPage.purchaseAsGuest(userData);

        try {
            verificationPage.verifyPurchase();
            System.out.print("The guest purchase is finished. Everything looks good.");
        } catch (Exception e) {
            Assert.fail("Something went wrong. The test has failed.");
        }
    }

}
