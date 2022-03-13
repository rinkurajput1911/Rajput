package page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	//Declaration
	
		@FindBy(xpath="//input[@id='email']") private WebElement uId;
	
		
		@FindBy(xpath="//input[@id='pass']") private WebElement pwd;
		
		@FindBy(xpath="//button[@name='login']") private WebElement btn;
		
		
		//Intilization
		POM (WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		
		
		//usage
		public void setUserId(String uname) {
			uId.sendKeys(uname);
			
		}
		
		public void setPassword(String pass) {
			pwd.sendKeys(pass);
		}
		
		
		public void clickLoginBtn() {
			btn.selec
		}
		
	


}
