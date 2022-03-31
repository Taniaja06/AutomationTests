package step.definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefs {
	WebDriver driver;
	
	@Given("^user able to open the browser$")
	public void user_able_to_open_the_browser()  {	
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	}

	@Given("^user able to enter the \"([^\"]*)\" url$")
	public void user_able_to_enter_the_url(String arg1)  {
	   
	    
	}

	@When("^user able to enter the valid username \"([^\"]*)\" & password \"([^\"]*)\"$")
	public void user_able_to_enter_the_valid_username_password(String arg1, String arg2)  {
	   
	    
	}

	@When("^user able to click on the login button$")
	public void user_able_to_click_on_the_login_button()  {
	   
	    
	}

	@Then("^user can verify the user information$")
	public void user_can_verify_the_user_information()  {
	   
	    
	}


}
