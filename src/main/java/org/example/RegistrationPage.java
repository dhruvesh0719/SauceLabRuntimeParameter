package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils
{
    LoadProp loadProp = new LoadProp();
    //Registration detail to entre
    public void entreTheRegistrationDetails()
    {
        //Entre The First name
        typeText(By.id("FirstName"),loadProp.getProperty("Firstname"));

        //Entre The Last name
        typeText(By.name("LastName"),loadProp.getProperty("Lastname"));

        //Choose day from date of birth drop box
        selectByVisibleText(By.name("DateOfBirthDay"), "5");

        //Choose month from date of birth drop box
        selectByValue(By.name("DateOfBirthMonth"), "3");

        //Choose Year from date of birth drop box
        selectByValue(By.name("DateOfBirthYear"), "1980");

        //Entre the email address
        typeText(By.name("Email"), email);

        //Entre the Password
        typeText(By.id("Password"), password);

        //Entre the Confirm Password
        typeText(By.id("ConfirmPassword"),password);

        //Click on Register button
        clickOnElement(By.name("register-button"));
    }
}
