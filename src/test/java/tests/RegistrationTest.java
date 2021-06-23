package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import utilities.PropertyManager;

public class RegistrationTest extends BaseTest {
    public HomePage homePage;
    public LogInPage logInPage;

    @Test
    public void registration() {
        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);

        logInPage.basePage();
        logInPage.registration(
                PropertyManager.getInstance().getFirstName(),
                PropertyManager.getInstance().getLastName(),
                PropertyManager.getInstance().getReg_email(),
                PropertyManager.getInstance().getReg_password()
        );

        try {
            homePage.verificationRegister("Thank you for registering with Main Website Store.");
            System.out.print("The user is successfully registered");
        } catch (Exception e) {
            Assert.fail("The user is failed to register.");
        }
    }
}
