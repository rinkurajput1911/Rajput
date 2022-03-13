package Calender_RedBus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driver_Initialization.SetUp;

public class sample_cal {
	public static void main(String[] args) throws InterruptedException {
		 SetUp jj=new SetUp();
	     WebDriver driver=jj.inDrive();
	     driver.get("https://www.redbus.in/bus-tickets");
	    driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
		Thread.sleep(1000);
		WebElement navigate = driver.findElement(By.xpath("((//div[@class='rb-calendar-month'])[2]//li)[1]"));
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		act.click(navigate).perform();
		Thread.sleep(1000);
		WebElement date = driver.findElement(By.xpath("(//li[@data-date='19'])[2]"));
		
		act.click(date).perform();
		
		
		
		
		
	}

}
