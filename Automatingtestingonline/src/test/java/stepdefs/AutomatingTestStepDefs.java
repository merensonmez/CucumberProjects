package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.AutomatingtestPage;
import utilities.Driver;
import utilities.WaitUtils;

import java.awt.*;


public class AutomatingTestStepDefs {

    AutomatingtestPage automatingtestPage = new AutomatingtestPage();

    public AutomatingTestStepDefs() throws AWTException {
    }


    @Given("user goes to the site")
    public void user_goes_to_the_site() {
        Driver.getDriver().get("https://automationintesting.online/");
        WaitUtils.waitFor(2);
    }
    @Given("user clicks let me hack! button")
    public void user_clicks_let_me_hack_button() {
        automatingtestPage.letMeHackButton.click();
        WaitUtils.waitFor(2);
    }

    @Given("user scrolls the mouse down")
    public void user_scrolls_the_mouse_down() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 100)");
    }

    @Given("user clicks when see book this room")
    public void user_clicks_when_see_book_this_room() {
        automatingtestPage.bookThisRoom.click();
    }

    @Given("user chooses the 30th day")
    public void user_chooses_the_30th_day() {
        automatingtestPage.thirtyDay.click();
    }

    @Given("user enters information")
    public void user_enters_information() {
        automatingtestPage.firstName.sendKeys("Eren");
        WaitUtils.waitFor(1);
        automatingtestPage.lastName.sendKeys("Sönmez");
        WaitUtils.waitFor(1);
        automatingtestPage.email.sendKeys("erensonmez.bussines@gmail.com");
        WaitUtils.waitFor(1);
        automatingtestPage.phone.sendKeys("05456651111");
        WaitUtils.waitFor(1);

    }

    @Given("user clicks Book button")
    public void user_clicks_book_button() {
        automatingtestPage.bookButton.click();
        WaitUtils.waitFor(1);
    }

    @Given("user verifies first verification message")
    public void user_verifies_first_verification_message() {
        if (automatingtestPage.message.isDisplayed()){
            System.out.println("'must not to null' message verified.");
        }else {
            System.out.println("'must not to null' message not verified.");
        }
    }

    @Given("user scrolls the mouse down last time")
    public void user_scrolls_the_mouse_down_last_time() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 100)");
        WaitUtils.waitFor(1);
    }

    @Given("user enters information and write message for form")
    public void user_enters_information_and_write_message_for_form() {
        automatingtestPage.formName.sendKeys("Eren");
        WaitUtils.waitFor(1);
        automatingtestPage.formEmail.sendKeys("erensonmez.bussines@gmail.com");
        WaitUtils.waitFor(1);
        automatingtestPage.formPhone.sendKeys("05456651111");
        WaitUtils.waitFor(1);
        automatingtestPage.formSubject.sendKeys("Cucumber Test");
        WaitUtils.waitFor(1);
        automatingtestPage.formDescription.sendKeys("Eren Sonmez is a software test automation engineer.He knows Java,MySQL,Selenium(Junit,TestNG,Cucumber BDD),HTML&CSS.");
        WaitUtils.waitFor(2);

    }

    @Given("user clicks submit button")
    public void user_clicks_submit_button() {
        automatingtestPage.formSubmitButton.click();
    }

    @Then("user verifies last verification message")
    public void user_verifies_last_verification_message() throws AWTException {
        if(automatingtestPage.message1.isDisplayed()){
            System.out.println("'Thanks for getting in touch' message verified.");
        }else {
            System.out.println("'Thanks for getting in touch' message not verified.");
        }
        WaitUtils.waitFor(2);
        Driver.getDriver().close();
    }
}
