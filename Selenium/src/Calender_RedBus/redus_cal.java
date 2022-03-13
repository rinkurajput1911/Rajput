package Calender_RedBus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driver_Initialization.SetUp;

public class redus_cal {
	
	public static void main(String[] args) throws InterruptedException {
		 SetUp jj=new SetUp();
	     WebDriver driver=jj.inDrive();
	     driver.get("https://www.redbus.in/bus-tickets");
		driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
		Thread.sleep(1000);
		WebElement next = driver.findElement(By.xpath("(//li[@class='rb-next active'])[1]"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.click(next).perform();
	Thread.sleep(1000);
		act.click(next).perform();
		Thread.sleep(1000);
//		act.click(next).perform();
		Thread.sleep(1000);
		int  bookingdate= 10;
		WebElement date = driver.findElement(By.xpath("(//li[@data-date='"+bookingdate+"'])[2]"));
		Thread.sleep(1000);
		act.click(date).perform();
	
	
	}

}
