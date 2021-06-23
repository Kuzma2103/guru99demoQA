package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import utilities.PropertyManager;

public class FailedLoginTest extends BaseTest {
    public HomePage homePage;
    public LogInPage logInPage;

    @Test
    public void failedLogin() {
        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);

        logInPage.basePage();
        logInPage.login(PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getPassword());

        try {
            homePage.verificationLoginFailed("Invalid login or password.");
            System.out.print("The user is not logged in.");
        } catch (Exception e) {
            Assert.fail("The user is logged in.");
        }

    }
}
