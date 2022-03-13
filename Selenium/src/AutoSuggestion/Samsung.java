package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class Samsung {
	
	public static void main(String[] args) throws InterruptedException {
		
		SetUp dr=new SetUp();
		WebDriver driver = dr.inDrive();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Samsung");
		Thread.sleep(1000);
		List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	   	String exptext = "samsung a50";
		System.out.println(alloption);
		System.out.println(alloption.get(5).getText());
		for (int i=0; i<alloption.size();i++)
		{
			 String actext = alloption.get(i).getText();
			 System.out.println(actext);
			 
			 if(exptext.equals(actext))
			 {
				 alloption.get(i).click();
				 break;
			 }
				 
			
	//	}
		
		
		
		
		
	}

}
