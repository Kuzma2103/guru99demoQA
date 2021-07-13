package pages;

import methods.VerificationMethod;
import org.openqa.selenium.WebDriver;

public class VerificationPage extends BasePage {
    public VerificationPage(WebDriver driver) {
        super(driver);
    }

    public VerificationMethod method;

    public VerificationPage verifyUserRegistration() {
        method = new VerificationMethod(driver);
        method.verifyRegistration("Thank you for registering with Main Website Store.");
        return this;
    }

    public VerificationPage verifyUserLogin() {
        method = new VerificationMethod(driver);
        method.verifyUserLogin("MY DASHBOARD");
        return this;
    }

    public VerificationPage verifyUserFailLogin() {
        method = new VerificationMethod(driver);
        method.verifyFailUserLogin("Invalid login or password.");
        return this;
    }

    public VerificationPage verifyUserLogout() {
        method = new VerificationMethod(driver);
        method.verifyUserLogout("DEFAULT WELCOME MSG!");
        return this;
    }

    public VerificationPage verifyPurchase() {
        method = new VerificationMethod(driver);
        method.verifyPurchase("YOUR ORDER HAS BEEN RECEIVED.");
        return this;
    }

}
