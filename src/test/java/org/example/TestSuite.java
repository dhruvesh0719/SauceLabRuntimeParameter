package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest
{
    //Create objects of all Page classes
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    HomePage homePage = new HomePage();
    LeicaTMirrorlessDigitalCameraPage leicaTMirrorlessDigitalCameraPage = new LeicaTMirrorlessDigitalCameraPage();
    LoginPage loginPage = new LoginPage();
    ReferToFriendPage referToFriendPage = new ReferToFriendPage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();



    //Verify User Should Register Successfully
    @Test
    public void verifyUserShouldRegisterSuccessfully()
    {
        //Open Home page & click on register button
        homePage.clickOnRegister();

        //Entre Registration Details
        registrationPage.entreTheRegistrationDetails();

        //Verify Registration message
        registrationResultPage.verifyUserShouldRegisterSuccessfully();

    }

    //User Should Login Successfully
    @Test
    public void verifyUserShouldLoginSuccessfullyAndReferToFriend()
    {
        //Open Home page & click on register button
        homePage.clickOnRegister();

        //Entre Registration Details
        registrationPage.entreTheRegistrationDetails();

        //Verify Registration message
        registrationResultPage.verifyUserShouldRegisterSuccessfully();

        //Entre login in details
        loginPage.entreLoginDetails();

        //Click on Electronics
        electronicsPage.clickOnCameraAndPhoto();

        //Click on Camera and photo
        cameraAndPhotoPage.ClickOnLeicaTMirrorlessDigitalCamera();

        //Click on Leica T Mirrorless Digital Camera
        leicaTMirrorlessDigitalCameraPage.clickOnEmailaFriend();

        //Refer a product to friend
        referToFriendPage.referToFriend();
    }



    //User should build his own computer
    @Test
    public void verifyUserShouldBuildOwnComputer()
    {
        //Click on Build your own computer
        homePage.clickOnBuildYourOwnComputer();

        //Build your computer
        buildYourOwnComputerPage.buildYourOwnComputer();

        //Verify shopping cart
        shoppingCartPage.verifyShoppingCart();
    }
}
