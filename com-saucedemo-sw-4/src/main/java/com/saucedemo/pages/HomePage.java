package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By emailField = By.name("user-name");
    By passField = By.id("password");
    By loginButton = By.xpath("//input[@id='login-button']");

    public void sendEmail(String email){
        sendTextToElement(emailField, email);
    }
    public void sendPassword(String pass){
        sendTextToElement(passField, pass);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
}
