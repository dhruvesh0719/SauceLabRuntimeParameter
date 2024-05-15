package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utils
{

    //Select options to build your own Computer
    public void buildYourOwnComputer()
    {
        //Choose Processor
        selectByValue(By.name("product_attribute_1"),"2");

        //Choose RAM
        selectByVisibleText(By.name("product_attribute_2"), "4GB [+$20.00]");

        //Choose HDD
        clickOnElement(By.id("product_attribute_3_7"));

        //Choose OS
        clickOnElement(By.id("product_attribute_4_9"));

        //Choose Software
        clickOnElement(By.id("product_attribute_5_11"));

        //Click on ADD to cart button
        clickOnElement(By.id("add-to-cart-button-1"));

        //Click on Shopping cart button
        clickOnElement(By.className("cart-label"));
    }
}
