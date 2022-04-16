package com.my.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		//plugin = "", // generate reports
		features = ".//Features/", //feature folder location
		glue = "login.stepDefs", // stepdef location 
		tags = "@Smoke") // specify the test case to execute
		
public class MyRunner extends AbstractTestNGCucumberTests {

}
