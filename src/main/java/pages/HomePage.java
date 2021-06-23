package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By errorBy = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/ul/li/ul/li/span");
    By successRegBy = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span");

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
}
