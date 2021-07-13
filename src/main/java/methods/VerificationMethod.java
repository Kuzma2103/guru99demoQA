package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class VerificationMethod extends BasePage {

    public VerificationMethod(WebDriver driver) {
        super(driver);
    }

    By successMessageBy = By.xpath("//li[@class='success-msg']//ul//li//span[text()='Thank you for registering with Main Website Store.']");
    By dashboardBy = By.xpath("//div[@class='page-title']//h1[text()='My Dashboard']");
    By errorMessageBy = By.xpath("//li[@class='error-msg']//ul//li//span[text()='Invalid login or password.']");
    By defaultMessageBy = By.className("welcome-msg");
    By successGuestPurchaseBy = By.xpath("//div[@class='page-title']//h1[text()='Your order has been received.']");

    // Verify user registration
    public VerificationMethod verifyRegistration(String expectedText) {
        String successMessage = readText(successMessageBy);
        assertStringEquals(successMessage, expectedText);
        return this;
    }

    // Verify user login
    public VerificationMethod verifyUserLogin(String expectedText) {
        String dashboardText = readText(dashboardBy);
        assertStringEquals(dashboardText, expectedText);
        return this;
    }

    // Verify fail user to log in
    public VerificationMethod verifyFailUserLogin(String expectedText) {
        String errorMessage = readText(errorMessageBy);
        assertStringEquals(errorMessage, expectedText);
        return this;
    }

    // Verify user log out
    public VerificationMethod verifyUserLogout(String expectedText) {
        String defaultMessage = readText(defaultMessageBy);
        assertStringEquals(defaultMessage, expectedText);
        return this;
    }

    // Verify purchase as guest
    public VerificationMethod verifyPurchase(String expectedText) {
        String successPurchaseMessage = readText(successGuestPurchaseBy);
        assertStringEquals(successPurchaseMessage, expectedText);
        return this;
    }

}
