package com.lightbend.lagom.maven_archetype_lagom_java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Demo {
	
	/**
	 
	 
	 Task 2
	 1. Assert the $ value is equak to 3.3 in https://www.walla.co.il/   (https://finance.walla.co.il/)
	
	 */
	
	
	@Test
	public void purpouse() {
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability("marionette",true);
		WebDriver driver = new FirefoxDriver(capabilities);
		
		
		String baseUrl = "https://www.walla.co.il/";
		driver.navigate().to(baseUrl);
		System.out.println("Home page ");
		
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		WebElement NaveBar  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/div[1]/div/div[3]/ul/li[3]/a"));
		NaveBar.click();
		
		System.out.println("It should be in Dollar page ");
		
		
		// timeout for loading 
		try
		{
		    Thread.sleep(100);

		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		
		// now we are at money page 
		String Dollar_str =  driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[3]/section[2]/ul/li[1]/div[1]")).getAttribute("class");
		int Dollar= Integer.parseInt(Dollar_str);
		
		assertEquals(Dollar,3.3);
		
		driver.close();
		
	
		
    }
	
	@Before
	public void GettingReady() {
		Properties prop = new Properties(); 
		prop.setProperty("log4j.rootLogger", "WARN");
		PropertyConfigurator.configure(prop);
       // declaration and instantiation of objects/variables
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\selenium-java-4.1.2\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	
	}
	
	

}
