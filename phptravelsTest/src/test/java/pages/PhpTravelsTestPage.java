package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhpTravelsTestPage {

    public PhpTravelsTestPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//a[@class='btn-lg btn btn-outline-primary text-uppercase fs-6 w-100 waves-effect'][normalize-space()='Demo'])[1]")
    public WebElement demoButton;

    @FindBy(css = "input[placeholder='Last Name']")
    public WebElement firstname;

    @FindBy(css = "input[placeholder='First Name']")
    public WebElement lastname;

    @FindBy(css = "input[placeholder='Business Name']")
    public WebElement businessName;

    @FindBy(css = "input[placeholder='Email']")
    public WebElement email;

    @FindBy(id = "numb1")
    public WebElement numb1;

    @FindBy(id = "numb2")
    public WebElement numb2;

    @FindBy(xpath = "//input[@id='number']")
    public WebElement resultLocation;

    @FindBy(xpath = "//button[@id='demo']")
    public WebElement submitButton;

    @FindBy(xpath = "//strong[normalize-space()='Thank you!']")
    public WebElement thankYouMessage;
}
