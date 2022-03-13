package Popp_UP;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow2 {
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
        driver.findElement(By.xpath("(//div[@class='header-text'])[1]")).click();
                         
//         Iterator<String> window = ids.iterator();	
//                  String main = window.next();//0
//                  String child = window.next();//1
//                
//                  driver.switchTo().window(child);
//                  
//                //  System.out.println(main);
//                   driver.manage().window().maximize();
//                 Thread.sleep(1000);
//                 driver.close();
//                  driver.switchTo().window(main);
//                   Dimension dim=new Dimension(200,300); 
//         		driver.manage().window().setSize(dim);
//           		Thread.sleep(1000);
//                   driver.manage().window().maximize();
//                   
         
         
         
}
}
