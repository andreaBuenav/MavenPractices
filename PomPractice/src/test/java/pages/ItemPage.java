package pages;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {
    public ItemPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "add-to-cart")
    private WebElement add;

    public CheckoutPage selectedItems(){
        add.click();
      return new CheckoutPage(driver);
    }
}
