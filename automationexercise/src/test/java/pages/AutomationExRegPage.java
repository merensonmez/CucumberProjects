package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExRegPage {
    public AutomationExRegPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement signuploginButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement regName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement regEmail;

    @FindBy(css = "button[data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(css = "#id_gender1")
    public WebElement title;

    @FindBy (css = "#password")
    public WebElement password;

    @FindBy (css = "#days")
    public WebElement birthDay;

    @FindBy (css = "#months")
    public WebElement birthMonth;

    @FindBy (css = "#years")
    public WebElement birthYear;

    @FindBy (css = "#newsletter")
    public WebElement newsletter;

    @FindBy (css = "#optin")
    public WebElement optin;

    @FindBy (css = "#first_name")
    public WebElement firstName;

    @FindBy (css = "#last_name")
    public WebElement lastName;

    @FindBy (css = "#company")
    public WebElement company;

    @FindBy (css = "#address1")
    public WebElement address1;

    @FindBy (css = "#address2")
    public WebElement address2;

    @FindBy(css = "#country")
    public WebElement country;

    @FindBy(css = "#state")
    public WebElement state;

    @FindBy(css = "#city")
    public WebElement city;

    @FindBy(css = "#zipcode")
    public WebElement zipcode;

    @FindBy(css = "#mobile_number")
    public WebElement mobilenumber;

    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    public WebElement accountCreated;

    @FindBy(xpath = "//a[normalize-space()='Continue']")
    public  WebElement continueButton;

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    public WebElement accountDeleted;

    @FindBy(xpath = "//a[normalize-space()='Continue']")
    public WebElement finalContinueButton;
}
