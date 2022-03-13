package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driver_Initialization.SetUp;

public class Red_bus_calnder {
	
	@Test
	public void TC1() throws InterruptedException
	{
		SetUp jj=new SetUp();
	     WebDriver driver=jj.inDrive();	
		driver.get("https://www.redbus.in/bus-tickets");
		driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='rb-calendar-month'])[2]//li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("((//ul[@class='rb-calendar-days'])[2]//li)[22]")).click();

//		
////		//driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
////	Thread.sleep(1000);
//	WebElement date = driver.findElement(By.xpath("(//td[text()='20'])"));
//		
//     Actions act=new Actions(driver);
//     act.click(date).perform();

	}	
}

