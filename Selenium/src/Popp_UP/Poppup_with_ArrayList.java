package Popp_UP;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Poppup_with_ArrayList {
	
     public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
    		driver.get("https://demoqa.com/browser-windows");
    		driver.manage().window().maximize();
    		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
    		
    		    Set<String> ids = driver.getWindowHandles();
    		  System.out.println(ids.size());
    	  System.out.println(ids);
    	  //          "OR"
    	        ArrayList rr=new ArrayList(ids);
    	        driver.switchTo().window(rr.get(1).toString());
    	        Thread.sleep(2000);
    	        driver.close();
    	        Thread.sleep(2000);
    	        
    	        Dimension size=new Dimension(200, 500);
    	        driver.manage().window().setSize(size);
    	 
	}

}
