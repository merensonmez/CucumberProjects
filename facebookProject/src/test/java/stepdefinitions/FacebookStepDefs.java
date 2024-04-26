package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.FacebookPage;
import utilities.Driver;
import utilities.WaitUtils;

import static utilities.Driver.*;

public class FacebookStepDefs {


    FacebookPage facebookPage = new FacebookPage();
    @Given("user goes to the site")
    public void user_goes_to_the_site() {
        Driver.getDriver().get("https://www.facebook.com/");
        WaitUtils.waitFor(2);

    }
    @Given("user clicks on create new account button")
    public void user_clicks_on_create_new_account_button() {
        facebookPage.signupButton.click();
        WaitUtils.waitFor(2);
    }
    @Given("user enters user name")
    public void user_enters_user_name() {
        facebookPage.username.sendKeys("Eren");
        WaitUtils.waitFor(2);

    }
    @Given("user enters last name")
    public void user_enters_last_name() {
        facebookPage.lastName.sendKeys("Sönmez");
        WaitUtils.waitFor(2);
    }
    @Given("user enters email")
    public void user_enters_email() {
        facebookPage.email.sendKeys("erencp1e22@gmail.com");
        WaitUtils.waitFor(2);
    }
    @Given("user enters email confirmation")
    public void user_enters_email_confirmation() {
        if(facebookPage.emailConfirmation.isDisplayed()) {
            facebookPage.emailConfirmation.sendKeys("erencp1e22@gmail.com");
            WaitUtils.waitFor(1);
        }
    }
    @Given("user enters password")
    public void user_enters_password() {
        facebookPage.password.sendKeys("123456789Ee");
        WaitUtils.waitFor(2);
    }
    @Given("user selects birthday")
    public void user_selects_birthday() {
        dropdownSelectByValue(facebookPage.birthDay,"4");
        WaitUtils.waitFor(2);

    }
    @Given("user selects birth month")
    public void user_selects_birth_month() {
        dropdownSelectByValue(facebookPage.birthdayMonth, "10" );
        WaitUtils.waitFor(2);
    }
    @Given("user selects the year of birth")
    public void user_selects_the_year_of_birth() {
        dropdownSelectByValue(facebookPage.birthdayYear, "2004");
        WaitUtils.waitFor(2);
    }
    @Given("user selects gender")
    public void user_selects_gender() {
        WebElement gender = facebookPage.gender;
        if (!gender.isSelected()){
            gender.click();
        }
        WaitUtils.waitFor(2);
    }
    @Then("user presses the register button")
    public void user_presses_the_register_button() {
        facebookPage.finalsignupButton.click();
        WaitUtils.waitFor(4);

        Driver.closeDriver();
    }
}
