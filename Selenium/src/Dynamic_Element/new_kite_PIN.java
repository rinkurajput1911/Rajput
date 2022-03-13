package Dynamic_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class new_kite_PIN {
	
	@FindBy(xpath="//input[@type='password']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement butn;
	
	
	 new_kite_PIN(WebDriver oo)
	{
		PageFactory.initElements(oo, this);
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
