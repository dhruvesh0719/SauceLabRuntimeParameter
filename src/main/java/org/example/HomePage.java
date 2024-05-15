package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    //Click on Register
    public void clickOnRegister()
    {
        clickOnElement(By.className("ico-register"));
    }



    //Click on Build your own computer
    public void clickOnBuildYourOwnComputer()
    {
        clickOnElement(By.xpath("//a[text()=\"Build your own computer\"]"));
    }


}
