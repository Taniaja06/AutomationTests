package test.my.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", "json:target/cucumber.json"},
		features = ".//Features/",
		glue = "step.definitions",
		tags = "@Smoke"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
}
