package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By errorBy = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/ul/li/ul/li/span");
    By successRegBy = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span");
    By successGuestPurchaseBy = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/h2");
    By userNameBy = By.className("welcome-msg");
    By pageTitleBy = By.className("page-title"); // this is hidden when user logged out, so in test you should pass the word "TV" for the assertion.

    public HomePage verificationLoginFailed(String expectedText) {
        String errorMessage = readText(errorBy);
        assertStringEquals(errorMessage, expectedText);
        return this;
    }

    public HomePage verificationRegister(String expectedText) {
        String successMessage = readText(successRegBy);
        assertStringEquals(successMessage, expectedText);
        return this;
    }

    public HomePage verificationGuestPurchase(String expectedText) {
        String successPurchaseMessage = readText(successGuestPurchaseBy);
        assertStringEquals(successPurchaseMessage, expectedText);
        return this;
    }

    public HomePage verificationUserLogIn(String expectedText) {
        String user_name = readText(userNameBy);
        assertStringEquals(user_name, expectedText);
        return this;
    }

    public HomePage verificationLogout(String expectedText) {
        String user_logged_out = readText(pageTitleBy);
        assertStringEquals(user_logged_out, expectedText);
        return this;
    }
}
