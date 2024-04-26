package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import pages.AutomationExRegPage;
import utilities.Driver;
import utilities.WaitUtils;

import static utilities.Driver.dropdownSelectByValue;

public class AutomationExRegStepDef {

    AutomationExRegPage automationExRegPage = new AutomationExRegPage();

    @Given("user goes to the site")
    public void user_goes_to_the_site() {
        Driver.getDriver().get("https://automationexercise.com/");}

    @Given("user clicks Signup \\/ Login button")
    public void user_clicks_signup_login_button() {
        automationExRegPage.signuploginButton.click();
    }
    @Given("user enters name and email addresses")
    public void user_enters_name_and_email_addresses() {
        automationExRegPage.regName.sendKeys("Erens");
        WaitUtils.waitFor(2);
            automationExRegPage.regEmail.sendKeys("erensonmez2@gmail.com");
    }
    @Given("user clicks Signup button")
    public void user_clicks_signup_button() {
        automationExRegPage.signupButton.click();
        WaitUtils.waitFor(2);
    }
    @Given("user enters information")
    public void user_enters_information() {
        automationExRegPage.title.click();
        automationExRegPage.password.sendKeys("123456789Ee");
        WaitUtils.waitFor(1);
        dropdownSelectByValue(automationExRegPage.birthDay,"4");
        WaitUtils.waitFor(1);
        dropdownSelectByValue(automationExRegPage.birthMonth,"10");
        WaitUtils.waitFor(1);
        dropdownSelectByValue(automationExRegPage.birthYear,"2004");
        WaitUtils.waitFor(1);
        automationExRegPage.newsletter.click();
        WaitUtils.waitFor(1);
        automationExRegPage.optin.click();
        WaitUtils.waitFor(1);
        automationExRegPage.firstName.sendKeys("Eren");
        WaitUtils.waitFor(1);
        automationExRegPage.lastName.sendKeys("Sönmez");
        WaitUtils.waitFor(1);
        automationExRegPage.company.sendKeys("SönmezlerCompany");
        WaitUtils.waitFor(1);
        automationExRegPage.address1.sendKeys("151 Weston Place");
        WaitUtils.waitFor(1);
        automationExRegPage.address2.sendKeys("151 Weston");
        WaitUtils.waitFor(1);
        dropdownSelectByValue(automationExRegPage.country,"United States");
        WaitUtils.waitFor(1);
        automationExRegPage.state.sendKeys("Alaska");
        WaitUtils.waitFor(1);
        automationExRegPage.city.sendKeys("Ryleyberg");
        WaitUtils.waitFor(1);
        automationExRegPage.zipcode.sendKeys("85666-7414");
        WaitUtils.waitFor(1);
        automationExRegPage.mobilenumber.sendKeys("1-220-833-6061");
        WaitUtils.waitFor(1);

    }
    @Given("user clicks Create Account button")
    public void user_clicks_create_account_button() {
        automationExRegPage.createAccountButton.click();
        WaitUtils.waitFor(1);
    }
    @Given("user verifies that ACCOUNT CREATED is visible")
    public void user_verifies_that_account_created_is_visible() {
        if (automationExRegPage.accountCreated.isDisplayed()) {
            System.out.println("ACCOUNT CREATED! is visible");
        } else {
            System.out.println("ACCOUNT CREATED! is not visible");
        }
    }

    @Given("user clicks Continue button")
    public void user_clicks_continue_button() {
        automationExRegPage.continueButton.click();
        WaitUtils.waitFor(1);
    }
    @Given("user clicks Delete Account button")
    public void user_clicks_delete_account_button() {
        automationExRegPage.deleteAccount.click();
        WaitUtils.waitFor(1);
    }
    @Then("user verifies that ACCOUNT DELETED is visible and click Continue button")
    public void user_verifies_that_account_deleted_is_visible_and_click_continue_button() {
        if (automationExRegPage.accountDeleted.isDisplayed()) {
            System.out.println("ACCOUNT DELETED! is visible");
        } else {
            System.out.println("ACCOUNT DELETED! is not visible");
        }
        automationExRegPage.finalContinueButton.click();
        WaitUtils.waitFor(2);
        Driver.closeDriver();
    }

    }

