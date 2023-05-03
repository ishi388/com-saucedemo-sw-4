package com.saucedemo.pages;
/**
 * userShouldLoginSuccessfullyWithValid
 *
 * Credentials
 * * Enter “standard_user” username
 * * Enter “secret_sauce” password
 * * Click on ‘LOGIN’ button
 * * Verify the text “PRODUCTS”
 *
 * 2. verifyThatSixProductsAreDisplayedOnPage
 *
 * * Enter “standard_user” username
 * * Enter “secret_sauce” password
 * * Click on ‘LOGIN’ button
 * * Verify that six products are displayed
 * on page
 */

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

             By userNameField = By.xpath("//input[@id='user-name']");
             By passwordField = By.id("password");
             By loginButton = By.xpath("//input[@id='login-button']");
             By textProducts = By.xpath("//span[contains(text(),'Products')]");

             public void enterUsername(String user){
             sendTextToElement(userNameField, user );
             }
             public void enterPassword(String password){
                 sendTextToElement(passwordField, password);
             }
             public void clickOnLoginButton(){
                clickOnElement(loginButton);
             }
             public String product(){
                 return getTextFromElement(textProducts);
             }

}
