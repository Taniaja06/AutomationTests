package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Many locators: id, Xpath, CSS selector, Link text
// Xpath = //tagname[@attribute='value']

public class SeleniumLoginTest2 {
	
	
static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://github.com/");
		 driver.findElement(By.xpath("(//a[@class='HeaderMenu-link no-underline py-3 d-block d-lg-inline-block'])[1]"));
		 driver.findElement(By.xpath("(//a[@class='HeaderMenu-link no-underline py-3 d-block d-lg-inline-block'])[3]"));
		 driver.findElement(By.xpath("//input[@type='text']")).click();
		 driver.findElement(By.xpath("//a[@href='/login']")).click();
		 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Taniaja06");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("giuui2022!");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.navigate().back();
		 driver.findElement(By.xpath("//a[@data-ga-click='Header, click, Nav menu - item:pulls context:user']")).click();
		 driver.navigate().back();
		// driver.findElement(By.xpath("//body[@style='word-wrap: break-word;']")).click();
		 
		 //comment out either one 
	//	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("QA-Alam");
		// driver.findElement(By.xpath("//span[@class='js-jump-to-badge-search-text-global']")).click();
		 
		 
		 
		//driver.quit();
	}

}
