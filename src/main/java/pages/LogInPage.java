package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    String baseURL = PropertyManager.getInstance().getURL();

    By accountBy = By.xpath("//*[@id=\"header\"]/div/div[2]/div/a");
    By loginBy = By.xpath("//*[@id=\"header-account\"]/div/ul/li[6]/a");
    By emailBy = By.id("email");
    By passwordBy = By.id("pass");
    By loginbuttonBy = By.id("send2");

    //registration
    By registerBy = By.xpath("//*[@id=\"header-account\"]/div/ul/li[5]/a");
    By firstNameBy = By.id("firstname");
    By lastNameBy = By.id("lastname");
    By regEmailBy = By.id("email_address");
    By regPasswordBy = By.id("password");
    By confirmPasswordBy = By.id("confirmation");
    By registerButtonBy = By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span");

    public LogInPage basePage() {
        driver.get(baseURL);
        return this;
    }

    public LogInPage login(String email, String password) {
        click(accountBy);
        click(loginBy);
        writeText(emailBy, email);
        writeText(passwordBy, password);
        click(loginbuttonBy);
        return this;
    }

    public LogInPage registration(String firstName, String lastName, String reg_email, String reg_password) {
        click(accountBy);
        click(registerBy);
        writeText(firstNameBy, firstName);
        writeText(lastNameBy, lastName);
        writeText(regEmailBy, reg_email);
        writeText(regPasswordBy, reg_password);
        writeText(confirmPasswordBy, reg_password);
        click(registerButtonBy);
        return this;
    }
}
