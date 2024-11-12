package com.globant;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ShoppingCartPage;
import pages.LoginPage;
import utils.Listener;

@Listeners(Listener.class)
public class LogoutTest extends BaseTest {

    @DataProvider
    public Object[][] user() {
        return new Object[][]{
                {"standard_user","secret_sauce",4},
                {"locked_out_user","secret_sauce",2},
                {"problem_user","secret_sauce",3},
                {"performance_glitch_user", "secret_sauce",1},
                {"error_user","secret_sauce",2},
                {"visual_user","secret_sauce",1}
        };

    }
    @Test(dataProvider = "user", dataProviderClass = LogoutTest.class)
    public void thirdTest(String username, String password, int item){
        LoginPage loginPage = loadFirstPage();
        HomePage home = new HomePage(loadFirstPage().getDriver());
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(loadFirstPage().getDriver());


        try {
            if ("performance_glitch_user".equals(username)) {

                //Time for testing started
                log.info("Testing with performance_glitch_user. Expecting potential delays.");
                long startTime = System.currentTimeMillis();
                loginPage.login(username, password);

                //Total time for this user to finish testing
                long endTime = System.currentTimeMillis();
                long duration = endTime - startTime;
                log.info("Time for performance_glitch_user: " + duration + "ms");
            } else {

                //Time for testing started
                log.info("Testing started.");
                long startTime = System.currentTimeMillis();

                //Total time for this user to finish testing
                long endTime = System.currentTimeMillis();
                long duration = endTime - startTime;
                log.info("Time : " + duration + "ms");
            }

            //Methods to test
            loginPage.login(username, password);
            home.selectItems(item);
            shoppingCartPage.logOut();
            loginPage.correctPage();

    Assert.assertTrue(false, "Test successful");

}catch (Exception ex){
    System.out.println("Test failed " + ex.getMessage());

}

    }
}
