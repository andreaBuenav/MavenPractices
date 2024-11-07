package com.globant;


import baseTest.BaseTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ItemPage;
import pages.LoginPage;


/**
 * Unit test for simple App.
 */
public class PurchaseItemsTest extends BaseTest {


    //Select a random item and purchase it

    @Test()
    @Parameters({"username", "password", "item", "title"})
public void firstTest(String username,String password,int item,String title){
        //All page loads
        LoginPage login = loadFirstPage();
        HomePage home = loadHomepage();
        ItemPage itemPage = loadItemPage();
        CheckoutPage checkout = loadCheckoutPage();

        //Methods to test
        login.login(username, password);
        home.selectItems(item);
        itemPage.purchaseSelected();
        checkout.checkout();
        checkout.title(title);

    }




   // @Test
    /*
     Try to log out and check if you are correctly redirected to the login page
     */
    public void thirdTest(){

    }



}
