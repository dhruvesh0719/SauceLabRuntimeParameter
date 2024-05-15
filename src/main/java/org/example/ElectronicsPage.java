package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils
{
    public void clickOnCameraAndPhoto()
    {
        //click on Electronics
        clickOnElement(By.xpath("//body/div/div[2]/ul[1]/li[2]/a"));

        //Click on Camera & photo
        clickOnElement(By.xpath("//a[text()=\" Camera & photo \"]"));

    }
}
