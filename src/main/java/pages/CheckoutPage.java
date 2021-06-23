package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    By mobilePageBy = By.xpath("//*[@id=\"nav\"]/ol/li[1]/a");
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

    public void guestPurchase(
            String firstName,
            String lastName,
            String email,
            String address,
            String city,
            String zip,
            String telephone
    ) {
        click(mobilePageBy);
        click(addToCartBy);
        click(proceedToCheckoutBy);
        click(continueBy);
        writeText(firstNameBy, firstName);
        writeText(lasNameBy, lastName);
        writeText(emailAddressBy, email);
        writeText(addressBy, address);
        writeText(cityBy, city);
        Select state = new Select(driver.findElement(stateBy));
        state.selectByValue("1");
        writeText(zipBy, zip);
        Select country = new Select(driver.findElement(countryBy));
        country.selectByValue("AF");
        writeText(telephoneBy, telephone);
        click(billingContinueBy);
        click(shippingContinueBy);
        click(radioButtonMethodBy);
        click(paymentInfoContinueBy);
        click(placeOrderBy);
    }
}
