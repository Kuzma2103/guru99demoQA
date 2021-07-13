package pages;

import methods.LogoutMethod;
import org.openqa.selenium.WebDriver;

public class UserProfilePage extends BasePage {
    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    public LogoutMethod method;

    public UserProfilePage logoutUser() {
        method = new LogoutMethod(driver);
        method.logout();
        return this;
    }
}
