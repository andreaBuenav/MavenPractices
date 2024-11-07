package pages;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    //Buttons
    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCart;
    @FindBy(id = "checkout")
    private WebElement checkoutButton;
    @FindBy(id = "continue")
    private WebElement continueButton;
    @FindBy(id = "cancel")
    private WebElement backButton;
    @FindBy(id= "finish")
    private WebElement finishButton;
    @FindBy(id = "back-to-products")
    private WebElement backToHomeButton;

    //Inputs
    @FindBy(id = "first-name")
    private WebElement nameInput;
    @FindBy(id = "last-name")
    private WebElement lastNameInput;
    @FindBy(id = "postal-code")
    private WebElement zipInput;

    public void checkout(){





    }



    public void isTitleCorrect(){

    }







}
