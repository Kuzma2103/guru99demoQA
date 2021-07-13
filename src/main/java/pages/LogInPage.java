package pages;


import methods.LoginMethod;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public LoginMethod method;

    public LogInPage loginUser() {
        method = new LoginMethod(driver);
        method.login();
        return this;
    }

    public LogInPage failLoginUser() {
        method = new LoginMethod(driver);
        method.failLogin();
        return this;
    }

}
