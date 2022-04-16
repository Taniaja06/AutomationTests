package auto.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import auto.baseclass.BaseClass;

public class PageFac extends BaseClass{
	
	public PageFac() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='txtUsername']")
	@CacheLookup
	
	private WebElement enterUserName;

	public WebElement getEnterUserName() {
		return enterUserName;
	}
	
	@FindBy(xpath ="//input[@name='txtPassword']")
	@CacheLookup
	
	private WebElement enterPassW;

	public WebElement getEnterPassW() {
		return enterPassW;
	}
	
	@FindBy(xpath ="//input[@type='submit']")
	@CacheLookup
	
	private WebElement ClickOnLoginBTN;

	public WebElement getClickOnLoginBTN() {
		return ClickOnLoginBTN;
	}
}
	
	

	
	

