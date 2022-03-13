package Module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin2page {
	
	@FindBy(xpath="//input[@type='password']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement butn;
	
	
	kitelogin2page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPIN(String str3)
	{
		pin.sendKeys(str3);
	}
	public void clickPINbutton()
	{
		butn.click();
	}
	
}
