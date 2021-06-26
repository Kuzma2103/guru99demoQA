package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserProfilePage extends BasePage {
    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    By accountBy = By.xpath("//*[@id=\"header\"]/div/div[2]/div/a/span[2]");
    By logoutBy = By.className("last");

    public UserProfilePage logout() {
        click(accountBy);
        click(logoutBy);
        return this;
    }
}
