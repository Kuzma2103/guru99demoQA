package pages;

import methods.RegistrationMethod;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationMethod method;

    public RegistrationPage registerUser(ArrayList<String> userData) {
        method = new RegistrationMethod(driver);
        method.register(userData);
        return this;
    }
}
