package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class RedBus_Jaipur {
	public static void main(String[] args) throws InterruptedException {
		SetUp dr=new SetUp();
        WebDriver driver = dr.inDrive();
        driver.get("https://www.redbus.in/");
       driver.findElement(By.xpath("(//input[@class='db'])[1]")).sendKeys("jai");
       Thread.sleep(2000);
    List<WebElement> alloption = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
       String expresult = "Jaipur (rajasthan)";
       
       for( WebElement dd:alloption)
       {
    	   String actualtext = dd.getText();
    	   if(actualtext.equals(expresult))
    	   {
    		   dd.click();
    		   System.out.println(actualtext); 
    		   break;
    	   }
    	   
       } 
      
       
       
       
       
	}
	

}
