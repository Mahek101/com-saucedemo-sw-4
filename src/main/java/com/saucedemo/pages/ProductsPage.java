package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductsPage extends Utility {

    By textDisplayed = By.xpath("//span[@class='title']");
    By totalNoOfProductsDisplayed = By.className("inventory_item");


    public String getText(){
        return getTextFromElement(textDisplayed);
    }
    public int getNumber(){
        return getNumberFromElement(totalNoOfProductsDisplayed);
    }

}
