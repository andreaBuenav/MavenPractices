package com.globant;


import baseTest.BaseTest;
import java.util.logging.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ItemPage;
import pages.LoginPage;


/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest {

    public Logger log = Logger.getLogger(String.valueOf(AppTest.class));

    //Select a random item and purchase it
    @Test(groups = {"group 1", "group 2","group 3"})
    public void init(){
       log.info("Starting tests");
    }

    @Test(groups = {"group 1"})
    @Parameters({"username", "password", "item", "title"})
public void firstTest(String username,String password,int item,String title){
        //All page loads
        LoginPage login = loadFirstPage();
        HomePage home = loadHomepage();
        ItemPage itemPage = loadItemPage();
        CheckoutPage checkout = loadCheckoutPage();

        //Methods to test
        login.login(username, password);
        home.selectItem(item);
        itemPage.purchaseSelected();
        checkout.checkout(title);



    }

   // @Test
    /*
     Select 3 random items, go to the checkout page, remove them and check reassure
     that the cart is now empty
     */
    public void secondTest(){

    }
   // @Test
    /*
     Try to log out and check if you are correctly redirected to the login page
     */
    public void thirdTest(){

    }



}
