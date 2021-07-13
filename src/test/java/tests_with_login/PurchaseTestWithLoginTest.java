package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.CheckoutPage;
import pages.VerificationPage;

import java.util.ArrayList;

public class PurchaseTestWithLoginTest extends BaseTestWithLogin {
    public CheckoutPage checkoutPage;
    public VerificationPage verificationPage;
    ArrayList<String> userData = new ArrayList<>();

    @Test
    public void loginPurchase() {
        checkoutPage = new CheckoutPage(driver);
        verificationPage = new VerificationPage(driver);

        checkoutPage.purchaseAsUser(userData);

        try {
            verificationPage.verifyPurchase();
            System.out.print("The purchase is finished. Everything looks good.");
        } catch (Exception e) {
            Assert.fail("Something went wrong. The test has failed.");
        }
    }
}
