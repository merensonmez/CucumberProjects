package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Wait;
import pages.SaucedemoTestPage;
import utilities.Driver;
import utilities.WaitUtils;

public class SaucedemoStepDef {
    SaucedemoTestPage saucedemoTestPage = new SaucedemoTestPage();

    @Given("user goes to the site")
    public void user_goes_to_the_site() {
        Driver.getDriver().get("https://www.saucedemo.com/");
    }

    @Given("user logs in by entering information")
    public void user_logs_in_by_entering_information() {
        saucedemoTestPage.username.sendKeys("standard_user");
        WaitUtils.waitFor(2);
        saucedemoTestPage.password.sendKeys("secret_sauce");
        WaitUtils.waitFor(2);
        saucedemoTestPage.login.click();
        WaitUtils.waitFor(2);
    }
    @Given("user clicks on the product to buy")
    public void user_clicks_on_the_product_to_buy() {
        saucedemoTestPage.product.click();
        WaitUtils.waitFor(2);
    }
    @Given("user clicks on add to card")
    public void user_clicks_on_add_to_card() {
        saucedemoTestPage.addToCart.click();
        WaitUtils.waitFor(2);
    }
    @Given("user verifies that they added it to the card")
    public void user_verifies_that_they_added_it_to_the_card() {
        if (saucedemoTestPage.addToCartVerifiedMessage.isDisplayed()){
            System.out.println("Added to card successfully!!!");
        }else{
            System.out.println("Not added to card!!!");
        }
    }
    @Given("user comes to the purchase section")
    public void user_comes_to_the_purchase_section() {
        saucedemoTestPage.shoppingCartContainer.click();
        WaitUtils.waitFor(2);
    }
    @Given("user clicks on checkout")
    public void user_clicks_on_checkout() {
        saucedemoTestPage.checkout.click();
        WaitUtils.waitFor(2);
    }
    @Given("user enters information")
    public void user_enters_information() {
        saucedemoTestPage.firstnameCheckout.sendKeys("Eren");
        WaitUtils.waitFor(2);
        saucedemoTestPage.lastnameCheckout.sendKeys("Sönmez");
        WaitUtils.waitFor(2);
        saucedemoTestPage.zipcodeCheckout.sendKeys("44000");
        WaitUtils.waitFor(2);
        saucedemoTestPage.continueCheckout.click();
    }
    @Given("user checks that has entered the correct user information")
    public void user_checks_that_has_entered_the_correct_user_information() {
        if (saucedemoTestPage.verifiedMessageCheckout.isDisplayed()){
            System.out.println("True information!!!");
        }else {
            System.out.println("False information!!!");
        }
    }
    @Given("user clicks finish")
    public void user_clicks_finish() {
        saucedemoTestPage.finish.click();
        WaitUtils.waitFor(2);
    }
    @Then("user confirms that the order has been placed message")
    public void user_confirms_that_the_order_has_been_placed_message() {
        if (saucedemoTestPage.lastVerifiedMessageCheckout.isDisplayed()){
            System.out.println("Thank you for your order! message verified");
        }else {
            System.out.println("Thank you for your order! message NOT verified");
        }
        WaitUtils.waitFor(2);
        Driver.getDriver().close();
    }

}
