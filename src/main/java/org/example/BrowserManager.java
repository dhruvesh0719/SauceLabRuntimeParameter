package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {
    LoadProp loadProp = new LoadProp();

    //Provide browser name
    String browser = System.getProperty("browser");

    //sauceLab key
    String sauceURL = "https://oauth-dhruveshpatel0719-6a45d:ee89792a-787e-4366-b22c-e84cb1ab08c2@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

    //Use boolean to decide run local or on cloud
    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));


    //Choose browser depend on given variable
    public void openTheBrowser() {
        //Run on cloud
        if (cloud) {
            System.out.println("Run on cloud....................");
            System.out.println("chrome browser.....");

            //Run on chrome
            if (browser.equalsIgnoreCase("Chrome")) {
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setPlatformName("Windows 10");
                browserOptions.setBrowserVersion("latest");
                try {
                    driver = new RemoteWebDriver(new URL(sauceURL), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } else if (browser.equalsIgnoreCase("firefox")) //Run on firefox
            {
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setPlatformName("Windows 8.1");
                browserOptions.setBrowserVersion("latest");
                try {
                    driver = new RemoteWebDriver(new URL(sauceURL), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } else if (browser.equalsIgnoreCase("safari")) //Run on firefox
            {

                SafariOptions browserOptions = new SafariOptions();
                browserOptions.setPlatformName("macOS 13");
                browserOptions.setBrowserVersion("latest");

                try {
                    driver = new RemoteWebDriver(new URL(sauceURL), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Your browser name is wrong :" + browser);
            }

            //Run locally
        } else
        {
            if (browser.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            } else {
                System.out.println("Your browser name is wrong :" + browser);
            }
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(loadProp.getProperty("url"));
    }

    //Close the browser
    public void closeTheBrowser() {
        driver.quit();
    }
}
