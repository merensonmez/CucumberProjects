package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoexerciseProductPage {


    public AutoexerciseProductPage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//div[@id=\"dismiss-button\"]")
    public WebElement closeAd;

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsButton;

    @FindBy(xpath = "//a[normalize-space()='Men']   ")
    public WebElement menCategory;

    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    public WebElement tShirts;

    @FindBy(xpath = "(//a[contains(text(),'View Product')])[2]")
    public WebElement viewProduct;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//h4[normalize-space()='Added!']")
    public WebElement addedMessage;

    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    public WebElement  continueShoppingButton;

    @FindBy(xpath = "//a[normalize-space()='Cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    public WebElement registerLoginButton;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement email;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement lastLoginButton;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    public WebElement finalProceedToCheckout;

    @FindBy(xpath ="//textarea[@name='message']")
    public WebElement message;

    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    public WebElement placeOrder;

    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//input[@name='card_number']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    public WebElement CVC;

    @FindBy(xpath = "//input[@placeholder='MM']")
    public WebElement expirationMonth;

    @FindBy(xpath = "//input[@placeholder='YYYY']")
    public WebElement expirationYear;

    @FindBy(xpath = "//button[@data-qa=\"pay-button\"]")
    public WebElement payButton;

    @FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    public WebElement confirmedMessage;

    @FindBy(xpath = "//a[normalize-space()='Continue']")
    public WebElement lastContinueButton;

}
