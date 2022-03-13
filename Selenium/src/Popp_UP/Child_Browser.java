package Popp_UP;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		  Set<String> ids = driver.getWindowHandles();
		  System.out.println(ids.size());
		  System.out.println(ids);
             Iterator<String> window = ids.iterator();	
             
            // while(window.hasNext()) 'or'
             for (int i=0; i<=ids.size(); i++)
             {
            	 String main = window.next();
            	 String child = window.next();
            	 
            	 driver.switchTo().window(main);
            	 driver.manage().window().maximize();
            	 Thread.sleep(1000);
             	// driver.manage().window().minimize();   
             	 //driver.close();
            	  }
            	 
		  }
}