package com.lightbend.lagom.maven_archetype_lagom_java;

import static org.junit.Assert.assertTrue;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.apache.log4j.PropertyConfigurator;
import org.junit.*;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Test;


/**
 
 
 Task 1 
 1. Create a login test.
URL: https://cocktailale.web.app/getStarted
user: inter@gmail.com
password: Aa123123
 */

public class AppTest 




{
	
	public static void main(String[] args) {
		 Properties prop = new Properties(); 
		 prop.setProperty("log4j.rootLogger", "WARN");
		 PropertyConfigurator.configure(prop);
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver","C:\\Program Files\\selenium-java-4.1.2\\geckodriver-v0.30.0-win64\\geckodriver.exe");
    	DesiredCapabilities capabilities = new DesiredCapabilities(); 
        capabilities.setCapability("marionette",true);
		WebDriver driver = new FirefoxDriver(capabilities); 
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://cocktailale.web.app/getStarted";
        driver.get(baseUrl);
        
        
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("inter@gmail.com");
        
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Aa123123");
        
        WebElement btn = driver.findElement(By.className("btn"));
        btn.click();
        
       // String expectedTitle = "Welcome: Mercury Tours";
       // String actualTitle = "";
    //    textbox = driver.find_element_by_tag_name("input")
        //element = ((Object) driver).find_element_by_id("email");

        // launch Fire fox and direct it to the Base URL
        //driver.get(baseUrl);

        // get the actual value of the title
      //  actualTitle = driver.getTitle();
        
       // WebElement Widget = driver.findElement(By.className("w-24"));
      //  Widget.click();
        
        
//        WebElement Email = driver.findElement(By.id("email"));
//        Email.sendKeys("ahmad96_hafee@yahooo.com");
//        
//        WebElement Password = driver.findElement(By.id("pass"));
//        Password.sendKeys("123456");
//        
//        
//        WebElement Submit = driver.findElement(By.name("login"));
//        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
//        Submit.click();
//        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
//        Password.sendKeys("123456");
//        Submit.click();

        System.out.println("Signed in with Click");
       // assertTrue(true);
        
        

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
//        if (actualTitle.contentEquals(expectedTitle)){
//        	
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
       
        //close Fire fox
       // driver.close();
       
    }

    /**
     * Rigorous Test :-)
     */
   // @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
}
