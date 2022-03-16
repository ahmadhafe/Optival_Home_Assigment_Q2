package com.lightbend.lagom.maven_archetype_lagom_java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.HashMap;
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
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.host.Map;


public class Demo {
	

	
	
	@Test
	public void TestCase1() {
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability("marionette",true);
		WebDriver driver = new FirefoxDriver(capabilities);
		
		
		String baseUrl = "https://techdemotbaseo.kinsta.cloud/";
		driver.navigate().to(baseUrl);
		System.out.println("page ");
		System.out.println("It should be in the \"https://techdemotbaseo.kinsta.cloud/\"  ");
		
		
		// timeout for loading 
		try
		{
		    Thread.sleep(1000);

		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		
		// now we are at money page 
		//String Dollar_str =  driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[3]/section[2]/ul/li[1]/div[1]")).getAttribute("class");
		//int Dollar= Integer.parseInt(Dollar_str);
		
		assertTrue(true);
		
		driver.close();
		
	
		
    }
	
	@Test
	public void TestCase2() {
		
		// we will do the same as Testcase 1 with Mobile emulaterer
		
	}
	
	
	@Test
	public void TestCase3() {
		
		// we will do the same as Testcase 1 with installed VPN extention
		
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
