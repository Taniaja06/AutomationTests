package com.my.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty","json:target/cucumber.json"},
		features = ".//Features/", //feature folder location
		glue = "login.stepDefs", // stepdef location 
		tags = "@Smoke") // specify the test case to execute
		
public class MyRunner extends AbstractTestNGCucumberTests {

}
