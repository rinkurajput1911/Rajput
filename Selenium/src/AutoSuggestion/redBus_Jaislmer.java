package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class redBus_Jaislmer {
	
	public static void main(String[] args) throws InterruptedException {
		
		SetUp dr=new SetUp();
		        WebDriver driver = dr.inDrive();
		     driver.get("https://www.redbus.in/");  
		     driver.manage().window().maximize();
		     driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("jai");
		        //Jaisalmer
		       Thread.sleep(1000); 
		       List<WebElement> alltext = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li")); 
		       System.out.println(alltext);
		       String exptext = "JAISALMER";
		       
		       for( WebElement pp :alltext)
		       {
		    	   String actualtext = pp.getText();
		    			   if(actualtext.equalsIgnoreCase(exptext))
		    			   {
		    				   pp.click();
		    				   System.out.println(actualtext);
		    				   break;
		    			   }
		    			   
		       }
		        
		
	}

}
