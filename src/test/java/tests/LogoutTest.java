package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.UserProfilePage;
import tests_with_login.BaseTestWithLogin;

public class LogoutTest extends BaseTestWithLogin {
    public UserProfilePage userProfilePage;
    public HomePage homePage;

    @Test
    public void logout() {
        userProfilePage = new UserProfilePage(driver);
        homePage = new HomePage(driver);

        userProfilePage.logout();

        try {
            homePage.verificationLogout("TV");
            System.out.print("The user is logged out.");
        } catch (Exception e) {
            Assert.fail("The user has failed to log out.");
        }
    }
}
