package methods;

import data.DataCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.ArrayList;

public class PurchaseMethod extends BasePage {

    public PurchaseMethod(WebDriver driver) {
        super(driver);
    }

    By mobilePageBy = By.xpath("//a[@class='level0 '][text()='Mobile']");
    By addToCartBy = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button/span/span");
    By proceedToCheckoutBy = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button/span/span");
    By continueBy = By.id("onepage-guest-register-button");
    By firstNameBy = By.id("billing:firstname");
    By lasNameBy = By.id("billing:lastname");
    By emailAddressBy = By.id("billing:email");
    By addressBy = By.id("billing:street1");
    By cityBy = By.id("billing:city");
    By stateBy = By.id("billing:region_id");
    By zipBy = By.id("billing:postcode");
    By countryBy = By.id("billing:country_id");
    By telephoneBy = By.id("billing:telephone");
    By billingContinueBy = By.xpath("//*[@id=\"billing-buttons-container\"]/button/span/span");

    By shippingContinueBy = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button/span/span");
    By radioButtonMethodBy = By.xpath("//*[@id=\"p_method_checkmo\"]");
    By paymentInfoContinueBy = By.xpath("//*[@id=\"payment-buttons-container\"]/button/span/span");
    By placeOrderBy = By.xpath("//*[@id=\"review-buttons-container\"]/button/span/span");

    By tvBy = By.className("nav-2");
    By addTVToCartBy = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/div[3]/button/span/span");
    By selectBillingBy = By.id("billing-address-select");

    public PurchaseMethod purchaseAsGuest(ArrayList<String> userData) {
        DataCreation.registrationData(userData);

        click(mobilePageBy);
        click(addToCartBy);
        click(proceedToCheckoutBy);
        click(continueBy);
        writeText(firstNameBy, userData.get(0));
        writeText(lasNameBy, userData.get(1));
        writeText(emailAddressBy, userData.get(2));
        writeText(addressBy, userData.get(4));
        writeText(cityBy, userData.get(5));
        Select state = new Select(driver.findElement(stateBy));
        state.selectByValue("1");
        writeText(zipBy, userData.get(6));
        Select country = new Select(driver.findElement(countryBy));
        country.selectByValue("AF");
        writeText(telephoneBy, userData.get(7));
        click(billingContinueBy);
        click(shippingContinueBy);
        click(radioButtonMethodBy);
        click(paymentInfoContinueBy);
        click(placeOrderBy);

        return this;
    }

    public PurchaseMethod purchaseAsUser(ArrayList<String> userData) {
        DataCreation.registrationData(userData);

        click(tvBy);
        click(addTVToCartBy);
        click(proceedToCheckoutBy);

        try {
            Select selectBilling = new Select(driver.findElement(selectBillingBy));
            selectBilling.selectByIndex(0);
        } catch (Exception e) {
            System.out.print("Fields must be populated.");
        }
        click(billingContinueBy);
        writeText(addressBy, userData.get(4));
        writeText(cityBy, userData.get(5));
        Select state = new Select(driver.findElement(stateBy));
        state.selectByValue("1");
        writeText(zipBy, userData.get(6));
        Select country = new Select(driver.findElement(countryBy));
        country.selectByValue("AF");
        writeText(telephoneBy, userData.get(7));
        click(billingContinueBy);
        click(shippingContinueBy);
        click(radioButtonMethodBy);
        click(paymentInfoContinueBy);
        click(placeOrderBy);

        return this;
    }

}
