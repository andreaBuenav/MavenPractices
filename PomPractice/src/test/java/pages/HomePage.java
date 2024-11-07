package pages;

import basePage.BasePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


//Web elements
    @FindBy(id = "add-to-cart")
   private WebElement addToCart;
    @FindBy(id = "back-to-products")
    private WebElement back;

    //Method to select random items
    public ItemPage selectItem(int itemSelected) {
        int itemNumber = 0;
        Random random = new Random();
        while (itemSelected < itemNumber) {
            int randomIndex = random.nextInt(6);
            String itemId = "item-" + (randomIndex )+"-title-link";
            WebElement item = driver.findElement(By.id(itemId));
            if (item.isDisplayed() && item.isEnabled()) {
                item.click();
                addToCart.click();
                itemSelected++;
                back.click();
            }
        }
        return new ItemPage(driver);
    }
}


