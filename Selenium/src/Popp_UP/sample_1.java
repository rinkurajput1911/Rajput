package Popp_UP;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample_1 
{
        public static void main(String[] args) throws InterruptedException {
			
        	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        	WebDriver driver = new ChromeDriver();
        	driver.get("https://demoqa.com/browser-windows");
        	driver.manage().window().maximize();
        	driver.findElement(By.xpath("//button[@id='windowButton']")).click();
          Set<String> id = driver.getWindowHandles();	
          System.out.println(id.size());
          ArrayList rr=new ArrayList(id);
          driver.switchTo().window(rr
        		  .get(1).toString());
          // driver.switchTo().window(rr.get(1).toString());
          Thread.sleep(2000);
          driver.close();
          driver.switchTo().window(rr.get(0).toString());
          Thread.sleep(2000);
          driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
        
        }
        
 }
