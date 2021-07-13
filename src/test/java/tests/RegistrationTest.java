package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.RegistrationPage;
import pages.VerificationPage;
import utilities.PropertyManager;

import java.util.ArrayList;

public class RegistrationTest extends BaseTest {
    public RegistrationPage registrationPage;
    public VerificationPage verificationPage;
    ArrayList<String> registrationData = new ArrayList<>();

    @Test
    public void registration() {
        registrationPage = new RegistrationPage(driver);
        verificationPage = new VerificationPage(driver);

        registrationPage.registerUser(registrationData);

        try {
            verificationPage.verifyUserRegistration();
            System.out.print("The user is successfully registered");
            PropertyManager.setProperty("firstName", registrationData.get(0));
            PropertyManager.setProperty("lastName", registrationData.get(1));
            PropertyManager.setProperty("reg_email", registrationData.get(2));
            PropertyManager.setProperty("reg_password", registrationData.get(3));
        } catch (Exception e) {
            Assert.fail("The user is failed to register.");
        }
    }
}
