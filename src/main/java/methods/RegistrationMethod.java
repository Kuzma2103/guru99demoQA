package methods;

import data.DataCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.util.ArrayList;

public class RegistrationMethod extends BasePage {

    public RegistrationMethod(WebDriver driver) {
        super(driver);
    }

    By accountBy = By.xpath("//div[@class='account-cart-wrapper']/a[@data-target-element='#header-account']");
    By registerBy = By.xpath("//a[@title='Register']");
    By firstNameBy = By.id("firstname");
    By lastNameBy = By.id("lastname");
    By emailBy = By.id("email_address");
    By passwordBy = By.id("password");
    By confirmPasswordBy = By.id("confirmation");
    By registerButtonBy = By.xpath("//button[@type='submit'][@title='Register']");


    public RegistrationMethod register(ArrayList<String> userData) {

        DataCreation.registrationData(userData);

        click(accountBy);
        click(registerBy);
        writeText(firstNameBy, userData.get(0));
        writeText(lastNameBy, userData.get(1));
        writeText(emailBy, userData.get(2));
        writeText(passwordBy, userData.get(3));
        writeText(confirmPasswordBy, userData.get(3));
        click(registerButtonBy);

        return this;
    }
}
