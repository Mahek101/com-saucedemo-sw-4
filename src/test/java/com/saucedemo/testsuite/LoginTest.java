package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("standard_user");
        loginPage.enterpassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedText = "Products";
        String actualText = productsPage.getText();
        System.out.println("Actual text displayed on page is: " + actualText);
        Assert.assertEquals(actualText,expectedText,"Text is not displayed");
        int expectedNumber = 6;
        int actualNumber = productsPage.getNumber();
        System.out.println("Actual number of products are: " + actualNumber);
        Assert.assertEquals(actualNumber,expectedNumber,"Different number of products are displayed");
    }

}
