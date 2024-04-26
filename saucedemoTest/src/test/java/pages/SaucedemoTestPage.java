package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucedemoTestPage {
    public SaucedemoTestPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "user-name")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement login;

    @FindBy(id = "item_1_title_link")
    public WebElement product;

    @FindBy(id = "add-to-cart")
    public WebElement addToCart;

    @FindBy(id = "remove")
    public WebElement addToCartVerifiedMessage;

    @FindBy(id = "shopping_cart_container")
    public WebElement shoppingCartContainer;

    @FindBy(id = "checkout")
    public WebElement checkout;

    @FindBy(id = "first-name")
    public WebElement firstnameCheckout;

    @FindBy(id = "last-name")
    public WebElement lastnameCheckout;

    @FindBy(id = "postal-code")
    public WebElement zipcodeCheckout;

    @FindBy(id = "continue")
    public WebElement continueCheckout;

    @FindBy(xpath = "//div[@class=\"summary_total_label\"]")
    public WebElement verifiedMessageCheckout;

    @FindBy(id = "finish")
    public WebElement finish;

    @FindBy(xpath = "//h2[@class=\"complete-header\"]")
    public WebElement lastVerifiedMessageCheckout;
    }

