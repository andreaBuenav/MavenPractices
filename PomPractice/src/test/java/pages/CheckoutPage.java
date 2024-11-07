package pages;

import basePage.BasePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Set;


public class CheckoutPage extends BasePage {
    Faker faker = new Faker();
    private String name = faker.name().firstName();
    private String lastName= faker.name().lastName();
    private String zip = faker.number().digits(4);

    public CheckoutPage(WebDriver driver) {
        super(driver);
        this.name = name;
        this.lastName = lastName;
        this.zip = zip;
    }



    //Buttons

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


    //Page title
    @FindBy(className = "complete-header")
    private WebElement pageTitle;


    public void checkout(){
        nameInput.sendKeys(name);
        lastNameInput.sendKeys(lastName);
        zipInput.sendKeys(zip);
        continueButton.click();
        finishButton.click();

    }

    public void remove() {
        List<WebElement> removeButtons = driver.findElements(By.cssSelector(".btn.btn_secondary.btn_small.cart_button"));

        for (WebElement removeButton : removeButtons) {
            if (removeButton.isDisplayed() && removeButton.isEnabled() && removeButton.getText().equals("Remove")) {
                removeButton.click();
            }
        }
    }





    public void title(String title){
        if(isTitleCorrect(title)){
            waitToBeClickable(backToHomeButton);
            backToHomeButton.click();
        }else{
            System.out.println("Title does not match");;
        }
    }


    public boolean isTitleCorrect(String title){
      waitToBeVisible(pageTitle);
      return pageTitle.isDisplayed() && pageTitle.getText().equals(title);
    }








}
