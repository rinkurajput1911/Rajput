package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class Realme {
	
	public static void main(String[] args) throws InterruptedException {
		
		SetUp dr=new SetUp ();
		  WebDriver driver = dr.inDrive();
		  driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("realme");
	     Thread.sleep(1000);
		List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		   String expresult = "realme 8 pro";
		//   System.out.println(alloption);
		   
		   for( WebElement tt:alloption)
		   {
			       String acualresult = tt.getText();
			      // System.out.println(acualresult);
			       
			       if(acualresult.equals(expresult))
			       {
			    	   tt.click();
			    	   System.out.println(acualresult);
			    	   break;
			    	   
			       }
			       
		   }
		
		
		
		
		
	}
	

}
