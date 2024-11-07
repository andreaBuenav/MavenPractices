package baseTest;

import com.beust.jcommander.Parameter;
import mainDriver.MainDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ItemPage;
import pages.LoginPage;

public class BaseTest {


    MainDriver driver;
    @BeforeMethod(alwaysRun = true)
    @Parameters({"url"})
    public void beforeMethod(String url){
        driver = new MainDriver();
        driver.getDriver().manage().window().maximize();
        navigateTo(url);
    }

    public void navigateTo(String url){
        driver.getDriver().get(url);
    }




    //loads all the pages

    public LoginPage loadFirstPage(){
        return new LoginPage(driver.getDriver());
    }
    public HomePage loadHomepage(){
        return new HomePage(driver.getDriver());
    }

    public ItemPage loadItemPage(){
        return  new ItemPage(driver.getDriver());
    }

    public CheckoutPage loadCheckoutPage(){
        return new CheckoutPage(driver.getDriver());
    }


//    @AfterMethod
//    public void afterMethod(){
//        driver.getDriver().;
//    }


}
