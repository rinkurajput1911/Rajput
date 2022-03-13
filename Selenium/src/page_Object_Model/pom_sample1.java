package page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_sample1 {
	
	//decalaration
	@FindBy(xpath="//input[@name='email']") private WebElement us;
    @FindBy(xpath="//input[@type='password']") private WebElement ps;
     @FindBy(xpath="//button[@name='login']") private WebElement log;
//initalization
   pom_sample1(WebDriver pp)
   {
	   PageFactory.initElements(pp, this);
   }

//  usage
   
   public void username()
   {
	   us.sendKeys("Vishnu");
   }
   public void password()
   {
	   ps.sendKeys("rajpu@191111");
   }
   public void login()
   {
	   log.click();
   }
   
   


}
