package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import pages.PhpTravelsTestPage;
import utilities.Driver;
import utilities.WaitUtils;

public class PhpTravelsTestStepDef {
    PhpTravelsTestPage phpTravelsTest = new PhpTravelsTestPage();


    @Given("user goes to the site")
    public void user_goes_to_the_site() {
        Driver.getDriver().get("https://phptravels.com/");
    }

    @Given("user clicks Demo button")
    public void user_clicks_demo_button() {
        phpTravelsTest.demoButton.click();
    }

    @Given("user fills Instant demo request form")
    public void user_fills_instant_demo_request_form() {
        phpTravelsTest.firstname.sendKeys("Eren");
        WaitUtils.waitFor(1);
        phpTravelsTest.lastname.sendKeys("Sönmez");
        WaitUtils.waitFor(1);
        phpTravelsTest.businessName.sendKeys("erensonmezbusiness");
        WaitUtils.waitFor(1);
        phpTravelsTest.email.sendKeys("erensonmezbusiness@gmail.com");
        WaitUtils.waitFor(1);
    }

    @Given("user performs test addition")
    public void user_performs_test_addition() {
        WebElement numb1 = Driver.getDriver().findElement(By.id("numb1"));
        WebElement numb2 = Driver.getDriver().findElement(By.id("numb2"));

        String actualResult = String.valueOf(Integer.parseInt(numb1.getText()) + Integer.parseInt(numb2.getText()));
        phpTravelsTest.resultLocation.sendKeys(actualResult);
        WaitUtils.waitFor(2);
    }

    @Given("user clicks Submit button")
    public void user_clicks_submit_button() {
        if (phpTravelsTest.submitButton.isDisplayed())
            phpTravelsTest.submitButton.click();
        WaitUtils.waitFor(1);
    }


    @Then("user verifies Thank you! message")
    public void user_verifies_thank_you_message() {
        if (phpTravelsTest.thankYouMessage.isDisplayed()){
            System.out.println("Thank you! message verified");
        }else {
            System.out.println("Thank you! message not verified");
        }
    }

}
