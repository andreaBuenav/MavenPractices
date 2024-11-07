package pages;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Set;

public class ItemPage extends BasePage {
    public ItemPage(WebDriver driver) {
        super(driver);
    }


    //Buttons

    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCart;
    @FindBy(id = "checkout")
    private WebElement checkoutButton;
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logout;

    public CheckoutPage purchaseSelected()
    {
        waitToBeClickable(shoppingCart);
        shoppingCart.click();
        waitToBeClickable(checkoutButton);
        checkoutButton.click();
      return new CheckoutPage(driver);
    }



    public CheckoutPage removeSelected()
    {
        waitToBeClickable(shoppingCart);
        shoppingCart.click();
        return new CheckoutPage(driver);
    }







    public LoginPage logOut(){
        menu.click();
        logout.click();
        return new LoginPage(driver);
    }


}
