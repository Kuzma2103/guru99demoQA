package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LogoutMethod extends BasePage {

    public LogoutMethod(WebDriver driver) {
        super(driver);
    }

    By accountBy = By.xpath("//div[@class='account-cart-wrapper']/a[@data-target-element='#header-account']");
    By logoutBy = By.xpath("//a[@title='Log Out']");


    public LogoutMethod logout() {
        click(accountBy);
        click(logoutBy);
        return this;
    }
}
