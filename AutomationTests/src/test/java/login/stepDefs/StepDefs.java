package login.stepDefs;


import auto.baseclass.BaseClass;
import auto.pagefactory.PageFac;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs extends BaseClass{
	
	PageFac obj;
	
	@Given("^user able to open the browser$")
	public void user_able_to_open_the_browser()  {
	    BaseClass.setUp();
	    obj = new PageFac();
	}

	@Given("^user able to enter the \"([^\"]*)\" url$")
	public void user_able_to_enter_the_url(String url)  {
	    driver.get(url);
	   
	}

	@When("^user able to enter the valid username \"([^\"]*)\" & password \"([^\"]*)\"$")
	public void user_able_to_enter_the_valid_username_password(String username, String password)  {
	    obj.getEnterUserName().sendKeys(username);
	    obj.getEnterPassW().sendKeys(password);
	   
	}

	@When("^user able to click on the login button$")
	public void user_able_to_click_on_the_login_button()  {
	    obj.getClickOnLoginBTN().click();
	   
	}

	@Then("^user can verify the user information$")
	public void user_can_verify_the_user_information()  {
	    System.out.println(driver.getTitle());
	    driver.quit();
	   
	}
}