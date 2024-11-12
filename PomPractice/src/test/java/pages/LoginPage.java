package pages;

import basePage.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import java.util.NoSuchElementException;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Inputs
    @FindBy(id = "user-name")
    private WebElement usernameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;

    //Button
    @FindBy(id = "login-button")
    private WebElement loginButton;


    //Title
    @FindBy(id = "inventory_container")
    private WebElement pageTitle;
    @FindBy(css = "error-message-container error")
    private WebElement error;

    //Method to log into the platform
    public HomePage login(String username, String password){

        try {
            waitToBeVisible(usernameInput);
            usernameInput.sendKeys(username);
            waitToBeVisible(passwordInput);
            passwordInput.sendKeys(password);
            if (loginButton.isDisplayed() && loginButton.isEnabled()) {
                waitToBeClickable(loginButton);
                loginButton.click();
            }
            waitToBeVisible(pageTitle);
            return new HomePage(driver);
        }catch (NoSuchElementException e){
            throw new AssertionError("Unable to login");
        }catch (TimeoutException e){
            throw new AssertionError("Timeout limit passed");
        }catch (Exception e){
            throw new AssertionError("Unexpected error");
        }
    }


    //Method to know if we are on the login page
    public void correctPage(){
        if(isPageCorrect()){
        }else {
            System.out.println("Not in the login page!");
        }
    }

public boolean isPageCorrect(){
        waitToBeVisible(loginButton);
        return loginButton.isDisplayed();
}



}
