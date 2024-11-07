package pages;

import basePage.BasePage;
import com.github.javafaker.Faker;
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


    //Method to select random items
    public ItemPage selectItems(int itemsToSelect) {
        Set<Integer> selectedItems = new HashSet<>();
        Random random = new Random();
        while (selectedItems.size() < itemsToSelect) {
            int randomIndex = random.nextInt(6);
            if (selectedItems.add(randomIndex)) {
                String index = Integer.toString(randomIndex);
                String itemId = "item_" + index + "_title_link";
                WebElement item = driver.findElement(By.id(itemId));
                if (item.isDisplayed() && item.isEnabled()) {
                    waitToBeClickable(item);
                    item.click();
                    addToCart.click();
                    back.click();
                }
            }
        }

        return new ItemPage(driver);
    }








    }



