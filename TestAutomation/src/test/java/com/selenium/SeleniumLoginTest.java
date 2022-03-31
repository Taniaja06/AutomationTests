package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLoginTest {
	//use static to reuse
static WebDriver driver; 

	public static void main(String[] args) {
		//Driver object in selenium and data type is *WebDriver*
		//WebDriver driver = new ChromeDriver();
			
		System.setProperty("WebDriver.chrome.driver", "./Drivers/chrome");
		 driver = new ChromeDriver();
		//driver is instance of classes, chrome, firefox, safari, internet explorer etc
	}
}
//Creating a driver object referencing WebDriver interface
//WebDriver driver;

//Setting webdriver.gecko.driver property
//System.setProperty("webdriver.gecko.driver", pathToGeckoDriver + "\\geckodriver.exe");

//Instantiating driver object and launching browser
//driver = new FirefoxDriver();

//
//driver.get();

//driver.manage();

//driver.findelements(By.xpath("(/a")click);
//driver.findelements(By.id("input-email-address")).sendKeys("jahantan16@gmail.com");
//driver.findelements(By.id("input-password")).sendKeys("fhskfs");

// how to close the browser
//driver.quit(); 
//driver.close();

//difference btw quit and close
//quit can closed the browser and server both
// by close mwthod only close the browser

