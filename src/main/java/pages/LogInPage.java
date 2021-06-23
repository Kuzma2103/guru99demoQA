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
}
