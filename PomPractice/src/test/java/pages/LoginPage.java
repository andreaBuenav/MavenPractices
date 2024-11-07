package pages;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    //Method to log into the platform
    public HomePage login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        return  new HomePage(driver);
    }
}
