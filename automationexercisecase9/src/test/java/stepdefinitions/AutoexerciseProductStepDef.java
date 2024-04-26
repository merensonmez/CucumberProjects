package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutoexerciseProductPage;
import utilities.Driver;
import utilities.WaitUtils;

public class AutoexerciseProductStepDef {

    AutoexerciseProductPage autoexerciseProductPage = new AutoexerciseProductPage();



    @Given("user goes to the site")
    public void user_goes_to_the_site() {
        Driver.getDriver().get("https://automationexercise.com/");
        Driver.getDriver().navigate().refresh();
    }

    @Given("user clicks on Products button")
    public void user_clicks_on_products_button() {
        autoexerciseProductPage.productsButton.click();
        WaitUtils.waitFor(2);
        Driver.getDriver().navigate().refresh();
    }

    @Given("user click men category")
    public void user_click_men_category() {
        autoexerciseProductPage.menCategory.click();
        WaitUtils.waitFor(2);
    }

    @Given("user selects tshirths")
    public void user_selects_tshirths() {
        autoexerciseProductPage.tShirts.click();
        WaitUtils.waitFor(2);


    }

    @Given("user clicks View Product in Pure Cotton V-Neck T-Shirt")
    public void user_clicks_view_product_in_pure_cotton_v_neck_t_shirt() {
        autoexerciseProductPage.viewProduct.click();
        WaitUtils.waitFor(2);
    }

    @Given("user clicks Add to cart button")
    public void user_clicks_add_to_cart_button() {
        autoexerciseProductPage.addToCart.click();
        WaitUtils.waitFor(2);
    }

    @Given("user verifies that Added! is visible")
    public void user_verifies_that_added_is_visible() {
        if (autoexerciseProductPage.addedMessage.isDisplayed()){
            System.out.println("Added! is visible.");
    }else{
            System.out.println("Added! is not visible.");
        }

    }

    @Given("user clicks Continue shopping button")
    public void user_clicks_continue_shopping_button() {
        autoexerciseProductPage.continueShoppingButton.click();
        WaitUtils.waitFor(2);

    }
    @Given("user clicks Cart button")
    public void user_clicks_cart_button() {
        autoexerciseProductPage.cartButton.click();
        WaitUtils.waitFor(2);

    }
    @Given("user clicks Proceed to Checkout")
    public void user_clicks_proceed_to_checkout() {
        autoexerciseProductPage.proceedToCheckout.click();
        WaitUtils.waitFor(2);

    }
    @Given("user clicks Login button")
    public void user_clicks_login_button() {
        autoexerciseProductPage.registerLoginButton.click();
        WaitUtils.waitFor(2);

    }
    @Given("user enters email and password")
    public void user_enters_email_and_password() {
        autoexerciseProductPage.email.sendKeys("erensonmez2@gmail.com");
        WaitUtils.waitFor(1);
        autoexerciseProductPage.password.sendKeys("123456789Ee");
        WaitUtils.waitFor(1);

    }
    @Given("user clicks last Login button")
    public void user_clicks_last_login_button() {
        autoexerciseProductPage.lastLoginButton.click();
        WaitUtils.waitFor(1);

    }

    @Given("user clicks Cart button again")
    public void user_clicks_cart_button_again() {
        autoexerciseProductPage.cartButton.click();
        WaitUtils.waitFor(1);

    }
    @Given("user clicks final Proceed to Checkout")
    public void user_clicks_final_proceed_to_checkout() {
        autoexerciseProductPage.finalProceedToCheckout.click();
        WaitUtils.waitFor(1);

    }
    @Given("user writes message")
    public void user_writes_message() {
        autoexerciseProductPage.message.sendKeys("Eren Sönmez -----Cucumber Test-----");
        WaitUtils.waitFor(2);

    }
    @Given("user clicks Place Order button")
    public void user_clicks_place_order_button() {
        autoexerciseProductPage.placeOrder.click();
        WaitUtils.waitFor(1);

    }
    @Given("user enters cart information")
    public void user_enters_cart_information() {
        autoexerciseProductPage.nameOnCard.sendKeys("Eren Sönmez");
        WaitUtils.waitFor(1);
        autoexerciseProductPage.cardNumber.sendKeys("5763284255005155");
        WaitUtils.waitFor(1);
        autoexerciseProductPage.CVC.sendKeys("477");
        WaitUtils.waitFor(1);
        autoexerciseProductPage.expirationMonth.sendKeys("10");
        WaitUtils.waitFor(1);
        autoexerciseProductPage.expirationYear.sendKeys("2024");
        WaitUtils.waitFor(1);
    }
    @Given("user clicks on Pay and Confirm Order button")
    public void user_clicks_on_pay_and_confirm_order_button() {
        autoexerciseProductPage.payButton.click();
        WaitUtils.waitFor(1);

    }
    @Given("user verifies that Congratulations! Your order has been confirmed! message is visible")
    public void user_verifies_that_congratulations_your_order_has_been_confirmed_message_is_visible() {
       if(autoexerciseProductPage.confirmedMessage.isDisplayed()){
           System.out.println("Congratulations! Your order has been confirmed! message is visible.");
       }else {
           System.out.println("Congratulations! Your order has been confirmed! message is not visible");
       }
    }
    @Then("user enters Continue button")
    public void user_enters_continue_button() {
        autoexerciseProductPage.lastContinueButton.click();
        WaitUtils.waitFor(1);
        Driver.getDriver().close();

    }
}
