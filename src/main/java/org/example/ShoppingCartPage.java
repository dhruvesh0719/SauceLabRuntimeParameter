package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils
{
    //Created object for LoadProp class to read properties file
    LoadProp loadProp = new LoadProp();

        public void verifyShoppingCart()
    {
       String actualMessage = captureTextOfTheElement(By.className("product-name"));
        Assert.assertEquals(actualMessage,loadProp.getProperty("expectedShoppingCartMessage"), "You have selected wrong Item");
    }
}
