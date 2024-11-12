package pages;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


//Buttons
    @FindBy(id = "add-to-cart")
   private WebElement addToCart;
    @FindBy(id = "back-to-products")
    private WebElement back;
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logout;


    //Method to select random items
    public ShoppingCartPage selectItems(int itemsToSelect) {
        Set<Integer> selectedItems = new HashSet<>();
        Random random = new Random();
        while (selectedItems.size() < itemsToSelect) {
            int randomIndex = random.nextInt(6);
            if (selectedItems.add(randomIndex)) {
                String index = Integer.toString(randomIndex);
                String itemId = "item_" + index + "_title_link";
                WebElement item = driver.findElement(By.id(itemId));
                waitToBeClickable(item);
                if (item.isDisplayed() && item.isEnabled()) {
                    item.click();
                    addToCart.click();
                    back.click();
                }else {
                    throw new NoSuchElementException(" Item not available");
                }
                isItemInCart(itemId);

            }

        }

        return new ShoppingCartPage(driver);
    }


    public boolean isItemInCart(String itemId) {
        try {
            WebElement itemInCart = driver.findElement(By.id(itemId));
            return itemInCart.isSelected();
        } catch (NoSuchElementException e) {
            System.out.println(" Item not available");
            return false;
        }
    }



    }



