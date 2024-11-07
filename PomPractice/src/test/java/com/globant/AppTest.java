package com.globant;

import static org.junit.Assert.assertTrue;

import mainDriver.MainDriver;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    MainDriver driver;


     @BeforeMethod(alwaysRun = true)

     public void loadPage(){
         

     }

    @Test

     //Select a random item and purchase it
    public void firstTest(){

    }

    @Test
    /*
     Select 3 random items, go to the checkout page, remove them and check reassure
     that the cart is now empty
     */
    public void secondTest(){

    }
    @Test
    /*
     Try to log out and check if you are correctly redirected to the login page
     */
    public void thirdTest(){

    }



}
