package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.VerificationPage;
import pages.LogInPage;

public class FailedLoginTest extends BaseTest {
    public VerificationPage verificationPage;
    public LogInPage logInPage;

    @Test
    public void failedLogin() {
        verificationPage = new VerificationPage(driver);
        logInPage = new LogInPage(driver);

        logInPage.failLoginUser();

        try {
            verificationPage.verifyUserFailLogin();
            System.out.print("The user is not logged in.");
        } catch (Exception e) {
            Assert.fail("The user is logged in.");
        }

    }
}
