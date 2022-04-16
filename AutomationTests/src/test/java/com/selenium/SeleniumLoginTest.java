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



/*04/10/2022

Selenium drawbacks
1. can not automate the desktop application
to overcome the chellenges - by using Appium,Auto IT, UFT
2. -can not genarate the report
to overcome the chellenges - Third party API like TestNG, Junit and many more
3. - doesn't support c++(programming language)
4. - open source therefore security issue
to overcome the chellenges - any proxy company will provide that
5. - no owenarship, if there is issue you can not reach out to anyone
to overcome the chellenges - by help of the community


advantages
1. it is a open source 
2. faster
3. support multiple languages except c++
4. multiple browsers
5. multiple platforms
6. support cross browsers testing 
7. support parrallel testing 
8. 

** design pattern or page object model?
		/where do you store the web elements/ do you have any object repository 
ans: yes, i know the design pattern/ object repository/ web elements by using selenium page factory concepts
selenium doesnt have any object repository but i can create a page factory class where i can store all the web elements, it acts as a repo


3 concepts

base class oe parent cclass we initialize the browsers 
page factory class contains we implement opps concepts inheritance extending base class 
also contructor 
and encapsulation */





