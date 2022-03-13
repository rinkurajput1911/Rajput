package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class Redbus_Haridwar {
	
	public static void main(String[] args) throws InterruptedException {
		SetUp dr=new SetUp();
		          WebDriver driver = dr.inDrive();
		          driver.get("https://www.redbus.in/");
		         driver.findElement(By.xpath("(//input[@class='db'])[1]")).sendKeys("hari");
		        Thread.sleep(2000);
		      List<WebElement> alloption = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
		         String expresult = "Haridwar";
		         System.out.println(alloption.get(1).getText());
		         
      for( WebElement ss : alloption)
				{
					String actualresult = ss.getText();
					
					if (actualresult.contains(expresult)) 
                    {
                   	 ss.click();
                   	 break;
                   	 
                    }
     
				}
                     
               
	}

}
