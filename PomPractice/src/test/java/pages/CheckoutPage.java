package pages;

import basePage.BasePage;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    //Getters to obtain values

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getZip() {
        return zip;
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


    public void checkout(String title ){

        nameInput.sendKeys(name);
        lastNameInput.sendKeys(lastName);
        zipInput.sendKeys(zip);
        continueButton.click();
        finishButton.click();
    if(isTitleCorrect(title)){
    backToHomeButton.click();
    }else{
        System.out.println("Title does not match");;
    }

    }
    public void delete(){
    }



    public boolean isTitleCorrect(String title){
      waitToBeVisible(pageTitle);
      return pageTitle.isDisplayed() && pageTitle.getText().equals(title);
    }







}
