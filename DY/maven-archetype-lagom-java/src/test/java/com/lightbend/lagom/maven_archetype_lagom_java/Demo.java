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
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.host.Proxy;


public class Demo {
	

	
	@Test
	public void Test1() {
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability("marionette",true);
		WebDriver driver = new FirefoxDriver(capabilities);
		
		
		String baseUrl = "https://techdemotbaseo.kinsta.cloud/";
		driver.navigate().to(baseUrl);
		System.out.println("Home page ");
		
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		
	
		//lets assert we are in the correct page 
		String actualTitle = driver.getTitle();
		String expectedTitle = "15 Best Betting Apps in the UK [Android & iOS] 🥇July 2021 - TBA";
		assertEquals(expectedTitle,actualTitle);
		
		//assertEquals(Dollar,3.3);
		
		driver.close();
		
	
		
    }
	
	
	@Test
	public void Test2() {
		//need to do same as Test1 using emulator 
	
		
    }
	
	@Test
	public void Test3() {
		//need to do same as Test1 with different VPN  that I need to configured or we can use a special extention and configure Firefox Profile
		
		
	
				
		//Proxy proxy = new Proxy();
		//Adding the desired host and port for the http, ssl, and ftp Proxy Servers respectively
	//	proxy.setHttpProxy("<HOST:PORT>");
	//	proxy.setSslProxy("<HOST:PORT>");
	//	proxy.setSslProxy("<HOST:PORT>");
	//	proxy.setFtpProxy("<HOST:PORT>");
	//	FirefoxOptions options = new FirefoxOptions();
	//	options.setCapability("proxy", proxy);
		//Calling new Firefox profile for test
	
	
		
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
