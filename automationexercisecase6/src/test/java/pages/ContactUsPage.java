package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {
    public ContactUsPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    public WebElement getInTouchMessage;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    public WebElement subject;

    @FindBy(xpath = "//div//textarea[@name='message']")
    public WebElement message;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement successMessage;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement homeButton;
}
