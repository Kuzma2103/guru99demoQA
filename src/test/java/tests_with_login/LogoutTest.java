package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.VerificationPage;
import pages.UserProfilePage;

public class LogoutTest extends BaseTestWithLogin {
    public UserProfilePage userProfilePage;
    public VerificationPage verificationPage;

    @Test
    public void logout() {
        userProfilePage = new UserProfilePage(driver);
        verificationPage = new VerificationPage(driver);

        userProfilePage.logoutUser();

        try {
            verificationPage.verifyUserLogout();
            System.out.print("The user is logged out.");
        } catch (Exception e) {
            Assert.fail("The user has failed to log out.");
        }
    }
}
