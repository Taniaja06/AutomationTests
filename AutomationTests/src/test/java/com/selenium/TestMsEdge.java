package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestMsEdge {
	
static	WebDriver driver;

public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
	driver = new EdgeDriver();
	
	driver.get("https://www.nike.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@aria-label='New Releases']")).click();
	
	
	//driver.quit();
}

}
