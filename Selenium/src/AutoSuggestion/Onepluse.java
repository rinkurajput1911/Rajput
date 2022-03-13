package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class Onepluse {
	
	public static void main(String[] args) throws InterruptedException {
		SetUp dr=new SetUp();
		WebDriver driver = dr.inDrive();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("(//input[@class='gLFyf gsfi'])[1]")).sendKeys("oneplus");
		   Thread.sleep(1000);
		   List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		String exptresult = "oneplus nord ce2";
		
		for(int i=0; i<alloption.size(); i++)
		{
		
			String actualtext = alloption.get(i).getText();
			System.out.println(actualtext);
			
			if(exptresult.equals(actualtext))
			{
				alloption.get(i).click();
				break;
			}
			
			
			
		}
		
		
		
		
		
	}

}
