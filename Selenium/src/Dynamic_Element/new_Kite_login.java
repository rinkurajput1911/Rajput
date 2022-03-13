package Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver_Initialization.SetUp;

public class new_Kite_login {
	//declaration
	@FindBy(xpath="//button[@type='submit']") private WebElement button;
    @FindBy(xpath="//input[@type='password']") private WebElement password;
	@FindBy(xpath="//input[@id='userid']") private WebElement username;
	
	//
	
	public new_Kite_login(WebDriver kk)
	{
		PageFactory.initElements(kk, this);
	}
	
	public void enterUN(String str1   )
	{
		username.sendKeys(str1);	
	}
	public void enterPS(String str2)
	{
		password.sendKeys(str2);	
	}
	public void clickButton()
	{
		button.click();
	}
	
	
	

}
