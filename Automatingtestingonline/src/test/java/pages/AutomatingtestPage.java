package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

public class AutomatingtestPage {
    public AutomatingtestPage() throws AWTException {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//button[@type=\"button\"][1]")
    public WebElement letMeHackButton;

    @FindBy(xpath = "//button[normalize-space()='Book this room']")
    public WebElement bookThisRoom;

    @FindBy(xpath = "//button[normalize-space()='30']")
    public WebElement thirtyDay;

    @FindBy(name = "firstname")
    public WebElement firstName;

    @FindBy(name = "lastname")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//button[normalize-space()='Book']")
    public WebElement bookButton;

    @FindBy(xpath = "(//p[contains(text(),'must not be null')])[1]")
    public WebElement message;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement formName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement formEmail;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement formPhone;

    @FindBy(xpath = "//input[@id='subject']")
    public WebElement formSubject;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement formDescription;

    @FindBy(xpath = "//button[@id='submitContact']")
    public WebElement formSubmitButton;

    @FindBy(xpath = "//h2[normalize-space()='Thanks for getting in touch Eren!']")
    public WebElement message1;


}
