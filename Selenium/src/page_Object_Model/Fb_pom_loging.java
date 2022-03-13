package page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_pom_loging {
	
	@FindBy(xpath="//input[@type='text']") private WebElement username;
	
	Fb_pom_loging(WebDriver tt)
	{
		PageFactory.initElements(tt, this);
	}
	
	public void enterUN(String pp)
	{
		username.sendKeys(pp);
	}
	

}
