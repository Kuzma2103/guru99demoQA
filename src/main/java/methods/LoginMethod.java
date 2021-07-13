package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utilities.PropertyManager;

public class LoginMethod extends BasePage {

    public LoginMethod(WebDriver driver) {
        super(driver);
    }

    By accountBy = By.xpath("//div[@class='account-cart-wrapper']/a[@data-target-element='#header-account']");
    By loginBy = By.xpath("//a[@title='Log In']");
    By emailBy = By.id("email");
    By passwordBy = By.id("pass");
    By loginButtonBy = By.id("send2");

    public LoginMethod login() {
        click(accountBy);
        click(loginBy);
        writeText(emailBy, PropertyManager.getInstance().getReg_email());
        writeText(passwordBy, PropertyManager.getInstance().getReg_password());
        click(loginButtonBy);

        return this;
    }

    public LoginMethod failLogin() {
        click(accountBy);
        click(loginBy);
        writeText(emailBy, PropertyManager.getInstance().getReg_email());
        writeText(passwordBy, PropertyManager.getInstance().getBad_password());
        click(loginButtonBy);

        return this;
    }
}
