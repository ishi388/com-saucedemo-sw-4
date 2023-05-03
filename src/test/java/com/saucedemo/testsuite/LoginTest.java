package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.Products;
import com.saucedemo.testbase.BaseTest;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage login = new LoginPage();
    Products products = new Products();
    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        login.enterUsername("performance_glitch_user");
        login.enterPassword("secret_sauce");
        Thread.sleep(1000);
        login.clickOnLoginButton();
        String actualMsg="Products";
        String expectedMsg=login.product();
        Assert.assertEquals("Products do not match",expectedMsg,actualMsg);
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() throws InterruptedException {
        login.enterUsername("performance_glitch_user");
        login.enterPassword("secret_sauce");
        Thread.sleep(1000);
        login.clickOnLoginButton();
        int actualMsg=6;
        int expectedMsg=products.products();
        Assert.assertEquals("six products are not displayed",expectedMsg,actualMsg);

    }
}






