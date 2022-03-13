package Drag_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driver_Initialization.SetUp;

public class Diff_sit_DragAndDrop {
     public static void main(String[] args) {
		
    	 SetUp dr=new SetUp();
    	  WebDriver driver = dr.inDrive();
    	  driver.get("http://demo.automationtesting.in/Static.html");
    	  driver.manage().window().maximize();
    	  WebElement src = driver.findElement(By.xpath("//div[@id='dragarea']"));
    	  Actions act=new Actions(driver);
    	  act.moveToElement(src).perform();
    		//driver.switchTo().frame("dragarea");
    	WebElement img = driver.findElement(By.xpath("(//img[@id='angular'])[1]"));
    	
    	WebElement dest = driver.findElement(By.xpath("//div[@id='droparea']"));
        
    	
    	act.dragAndDrop(img, dest).perform();
    	
    	
    	
    
    	  
    	
    	 
    	 
    	 
    	 
	}
	
	
	
	
	
	
}
