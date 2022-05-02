package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.WeakHashMap;

public class Inventory extends Utility {
    By productsText = By.xpath("//span[contains(text(),'Products')]");
    By inventoryItem = By.xpath("//div[@class='inventory_item']");

    public String getProductsText(){
        return getTextFromElement(productsText);
    }
    public List<WebElement> fetchProducts(){
        return listOfWebElementsList(inventoryItem);
    }
}
