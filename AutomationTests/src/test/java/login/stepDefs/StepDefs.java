package login.stepDefs;

import org.openqa.selenium.WebDriver;

import auto.baseclass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs extends BaseClass{
	
	@Given("^user able to open the browser$")
	public void user_able_to_open_the_browser()  {
	    BaseClass.setUp();
	   
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