package Action_Class;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driver_Initialization.SetUp;

public class Calender_Redbus 
{
	public static void main(String[] args) throws InterruptedException 
	{
	     SetUp jj=new SetUp();
	     WebDriver driver=jj.inDrive();
	     driver.get("https://www.redbus.in/bus-tickets");
	    driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
	     
	    WebElement nextBtn = driver.findElement(By.xpath("(//div[@class='rb-calendar-month'])[2]//li[1]"));
	   Actions act=new Actions(driver);
	   Thread.sleep(2000);
	    act.click(nextBtn).perform();
	    Thread.sleep(1000);
	    act.click(nextBtn).perform();
	    Thread.sleep(1000);
	//Date=15
	    
	    int BookingDate=25;
//	    WebElement date = driver.findElement(By.xpath("(//li[@data-date='"+BookingDate+"'])[2]"));
	    WebElement date = driver.findElement(By.xpath("(//li[@data-date='15'])[2]"));
	    act.click(date).perform();
	
	
	}
	
}
