package Dynamic_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DianamicElement_BJF {
	@FindBy(xpath="((//div[@class='info'])[5]//span)[4]") private WebElement diaelement;
	DianamicElement_BJF (WebDriver ll)
	{
		PageFactory.initElements(ll, this);
	}
	
	public void element()
	{
		System.out.println(("ICIC= "+diaelement.getText()));
	}
	
}
