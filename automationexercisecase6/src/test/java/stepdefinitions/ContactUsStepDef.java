package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.et.Ja;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import pages.ContactUsPage;
import utilities.Driver;
import utilities.WaitUtils;

import static utilities.Driver.driver;

public class ContactUsStepDef{

    ContactUsPage contactUsPage = new ContactUsPage();

    @Given("user goes to the site")
    public void user_goes_to_the_site() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Given("user clicks Contact Us button")
    public void user_clicks_contact_us_button() {
        contactUsPage.contactUsButton.click();
        WaitUtils.waitFor(1);
    }

    @Given("user verifies message that GET IN TOUCH is visible")
    public void user_verifies_message_that_get_ın_touch_is_visible() {
        if (contactUsPage.getInTouchMessage.isDisplayed()) {
            System.out.println("'GET IN TOUCH' is visible");
        } else {
            System.out.println("'GET IN TOUCH' is not visible");
        }
    }
    @Given("user enters name,email,subject and message")
    public void user_enters_name_email_subject_and_message() {
        contactUsPage.name.sendKeys("Eren");
        WaitUtils.waitFor(1);
        contactUsPage.email.sendKeys("erensonmez2@gmail.com");
        WaitUtils.waitFor(1);
        contactUsPage.subject.sendKeys("Cucumber Test");
        WaitUtils.waitFor(1);
        contactUsPage.message.sendKeys("I'm trying to create new cucumber test");
        WaitUtils.waitFor(1);

    }

    @Given("user uploads file")
    public void user_uploads_file() {
        WebElement fileInput = Driver.getDriver().findElement(By.xpath("//input[@name='upload_file']"));
        fileInput.sendKeys("C:\\Users\\LENOVO\\Desktop\\DERSLER\\message.txt");
        WaitUtils.waitFor(1);
    }

    @Given("user clicks submit button")
    public void user_clicks_submit_button() {
        contactUsPage.submitButton.click();
        WaitUtils.waitFor(1);
        WaitUtils.waitFor(1);
    }

    @Given("user clicks OK button")
    public void user_clicks_ok_button() {
        Driver.getDriver().switchTo().alert().accept();
        //Driver.get().switchTo().Alert()//junit
        //Driver.getDriver().switchTo().alert().accept();//cucumber
        WaitUtils.waitFor(1);
    }

    @Given("user verifies message that Success! Your details have been submitted successfully is visible")
    public void user_verifies_message_that_success_your_details_have_been_submitted_successfully_is_visible() {
        if(contactUsPage.successMessage.isDisplayed()){
            System.out.println("Success! Your details have been submitted successfully is visible");
        }else{
            System.out.println("Success! Your details have been submitted successfully is not visible");
        }
    }

    @Then("user clicks Home button")
    public void user_clicks_home_button() {
        contactUsPage.homeButton.click();
        WaitUtils.waitFor(3);
        Driver.getDriver().close();
        WaitUtils.waitFor(2);
    }

}
