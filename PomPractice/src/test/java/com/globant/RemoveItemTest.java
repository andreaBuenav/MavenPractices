package com.globant;

import baseTest.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ItemPage;
import pages.LoginPage;

public class RemoveItemTest extends BaseTest {

    @Test
    @Parameters({"username", "password", "item"})
    public void seconTest(String username, String password, int item){
        LoginPage loginPage = loadFirstPage();
        HomePage homePage = loadHomepage();
        ItemPage itemPage = loadItemPage();
        CheckoutPage checkoutPage = loadCheckoutPage();


        loginPage.login(username, password);
        homePage.selectItems(item);
        itemPage.removeSelected();
        checkoutPage.remove();



    }
}
