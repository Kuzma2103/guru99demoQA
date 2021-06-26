package tests;


import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import utilities.PropertyManager;

public class LoginTest extends BaseTest {

    public LogInPage logInPage;
    public HomePage homePage;

    @Test
    public void login() {
        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        logInPage.basePage();
        logInPage.navigateToLogIn();
        logInPage.login(PropertyManager.getInstance().getReg_email(), PropertyManager.getInstance().getReg_password());

        try {
            homePage.verificationUserLogIn("WELCOME, JOHN DOE!");
            System.out.print("The user is logged in");
        } catch (Exception e) {
            Assert.fail("Fail to log in.");
        }
    }

}
