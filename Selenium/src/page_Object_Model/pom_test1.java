package page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pom_test1 
{
	
	
	//Declaration
	@FindBy(xpath="(//input[@type='text'])[1]") private WebElement fn;
	@FindBy(xpath="(//input[@type='text'])[2]") private WebElement ln;
	@FindBy(xpath="(//input[@type='text'])[3]") private WebElement mo;
    @FindBy(xpath="//select[@name='birthday_month']") private WebElement month;
    
    // initialaization
    
    pom_test1(WebDriver dr)
    {
    	PageFactory.initElements(dr, this);
    }
    
    //usage
    
    public void enterUS(String ll)
    {
    	fn.sendKeys(ll);
    }
    public void enterLN()
    {
    	ln.sendKeys("Rajput");
    }
    
   public void enterMO()
   {
	   mo.sendKeys("7620272894");
   }
   
   public void enterMONTH()
   
   {
	 Select ss=new Select(month);
	 ss.selectByVisibleText("Mar");
			 
   }
    
    
 }
