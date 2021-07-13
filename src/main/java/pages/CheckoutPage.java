package pages;

import methods.PurchaseMethod;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public PurchaseMethod method;

    public CheckoutPage purchaseAsGuest(ArrayList<String> userData) {
        method = new PurchaseMethod(driver);
        method.purchaseAsGuest(userData);
        return this;
    }

    public CheckoutPage purchaseAsUser(ArrayList<String> userData) {
        method = new PurchaseMethod(driver);
        method.purchaseAsUser(userData);
        return this;
    }
}
