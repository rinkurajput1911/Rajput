package Drag_Drop;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import driver_Initialization.SetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Image {
	
	public static void main(String[] args) {
		 SetUp dr=new SetUp();
   	  WebDriver driver = dr.inDrive();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		driver.switchTo().frame(3);
		WebElement sourc = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	 WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		    Actions act=new Actions(driver);
		    act.moveToElement(sourc).clickAndHold().moveToElement(dest).release().build().perform();
		  //  act.dragAndDrop(sourc, dest).perform();
		
		
		
		
	}

}
