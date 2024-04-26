package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.PhpTravelsTestSignupPage;
import utilities.Driver;
import utilities.WaitUtils;

public class PhpTravelsTestSignupStepDef {
    PhpTravelsTestSignupPage phpTravelsTestSignupPage = new PhpTravelsTestSignupPage();

    @Given("user clicks Signup button")
    public void user_clicks_signup_button() {

    }

    @Given("user enters personal information")
    public void user_enters_personal_information() {
        Driver.getDriver().get("https://phptravels.org/register.php");
        WaitUtils.waitFor(1);
        phpTravelsTestSignupPage.firstname.sendKeys("Eren");
        WaitUtils.waitFor(1);
        phpTravelsTestSignupPage.lastname.sendKeys("Sönmez");
        WaitUtils.waitFor(1);
        phpTravelsTestSignupPage.email.sendKeys("erensonmezbusiness@gmail.com");
        Driver.getDriver().findElement(By.xpath("//div[@class=\"selected-dial-code\"]")).click();
        WaitUtils.waitFor(1);
        Driver.getDriver().findElement(By.xpath("(//div[@class='iti-flag tr'])[1]")).click();
        phpTravelsTestSignupPage.phone.sendKeys("05456651111");
        WaitUtils.waitFor(1);
    }
    @Given("user enters billing address")
    public void user_enters_billing_address() {
        phpTravelsTestSignupPage.companyName.sendKeys("erensonmezcompany");
        WaitUtils.waitFor(1);
        phpTravelsTestSignupPage.streetAddress.sendKeys("Yesilyurt - Malatya");
        WaitUtils.waitFor(1);
        phpTravelsTestSignupPage.city.sendKeys("Malatya");
        WaitUtils.waitFor(1);
        phpTravelsTestSignupPage.state.sendKeys("Yesilyurt");
        WaitUtils.waitFor(1);
        phpTravelsTestSignupPage.postCode.sendKeys("44000");
        WaitUtils.waitFor(1);
        WebElement dropdownElement = Driver.getDriver().findElement(By.id("inputCountry"));
        Select select = new Select(dropdownElement);
        select.selectByValue("TR");
        System.out.println("Value : " + select.getFirstSelectedOption().getText());
        WaitUtils.waitFor(1);
    }
    @Given("user enters account security")
    public void user_enters_account_security() {
        phpTravelsTestSignupPage.password.sendKeys("123456789Ee");
        WaitUtils.waitFor(1);
        phpTravelsTestSignupPage.confirmPassword.sendKeys("123456789Ee");
        WaitUtils.waitFor(2);

        if (phpTravelsTestSignupPage.passwordStrength.isDisplayed()){
            System.out.println("Password Strength: 70% Moderate");
        }else {
            System.out.println("Password Strength not 70% Moderate");
        }
    }
    @Given("user clicks I'm not a robot")
    public void user_clicks_i_m_not_a_robot() {

    }
    @Given("user clicks register button")
    public void user_clicks_register_button() {

    }
    @Then("user confirms whether logged into the system")
    public void user_confirms_whether_logged_into_the_system() {

    }
}
