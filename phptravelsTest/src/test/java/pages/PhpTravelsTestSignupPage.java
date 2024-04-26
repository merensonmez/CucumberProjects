package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhpTravelsTestSignupPage {

    public PhpTravelsTestSignupPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='btn btn-primary rounded m-1 w-100 text-uppercase fs-6 px-0 waves-effect'])[1]")
    public WebElement signupButton;

    @FindBy(xpath = "//input[@id='inputFirstName']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='inputLastName']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='inputPhone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@id='inputCompanyName']")
    public WebElement companyName;

    @FindBy(xpath = "(//input[@id='inputAddress1'])[1]")
    public WebElement streetAddress;

    @FindBy(xpath = "//input[@id='inputCity']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='stateinput']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='inputPostcode']")
    public WebElement postCode;

    @FindBy(xpath = "//option[@value=\"TR\"]")
    public WebElement country;

    @FindBy(xpath = "//input[@id='inputNewPassword1']")
    public WebElement password;

    @FindBy(xpath = "(//input[@id='inputNewPassword2'])[1]")
    public WebElement confirmPassword;

    @FindBy(xpath = "//div[@aria-valuenow=\"70\"]")
    public WebElement passwordStrength;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement register;


}
