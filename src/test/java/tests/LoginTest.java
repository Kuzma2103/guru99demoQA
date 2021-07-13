package tests;


import org.junit.Assert;
import org.junit.Test;
import pages.VerificationPage;
import pages.LogInPage;

public class LoginTest extends BaseTest {

    public LogInPage logInPage;
    public VerificationPage verificationPage;

    @Test
    public void login() {
        logInPage = new LogInPage(driver);
        verificationPage = new VerificationPage(driver);

        logInPage.loginUser();

        try {
            verificationPage.verifyUserLogin();
            System.out.print("The user is logged in");
        } catch (Exception e) {
            Assert.fail("Fail to log in.");
        }
    }

}
