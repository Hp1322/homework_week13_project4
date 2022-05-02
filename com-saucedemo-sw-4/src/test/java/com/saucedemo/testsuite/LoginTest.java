package com.saucedemo.testsuite;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.Inventory;
import com.saucedemo.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    Inventory inventory = new Inventory();

    @Test
    public void userShouldLoginSuccessfullyWithValid(){
        homePage.sendEmail("standard_user");
        homePage.sendPassword("secret_sauce");
        homePage.clickOnLoginButton();
        Assert.assertEquals(inventory.getProductsText(), "PRODUCTS", "Not navigate to page");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        homePage.sendEmail("standard_user");
        homePage.sendPassword("secret_sauce");
        homePage.clickOnLoginButton();
        List<WebElement> Items = inventory.fetchProducts();
        int expected = 6;
        int actual = Items.size();
        Assert.assertEquals(actual, expected, "Not navigate to page");
    }
}
