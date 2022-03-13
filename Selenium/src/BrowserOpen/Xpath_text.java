package BrowserOpen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.conf.configartion1;

public class Xpath_text {
	
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
	         
			WebDriver driver = new ChromeDriver();
			driver.get(configartion1.appURL);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[contains(text(),'Gr')]")).click();
	       // driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
	    	

}
	}

