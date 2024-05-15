package org.example;



import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils
{
    LoadProp loadProp = new LoadProp();


    public void verifyUserShouldRegisterSuccessfully()
    {
        String actulMessage = captureTextOfTheElement(By.className("result"));
        Assert.assertEquals(actulMessage, loadProp.getProperty("expectedRegisteredMessage"),"You are not register Successfully");
    }
}
