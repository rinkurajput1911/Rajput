package Scroll_bar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.conf.configartion1;

public class Double_Scroll {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
		Thread.sleep(2000);
		driver.switchTo().frame("courses-iframe");
		//driver.findElement(By.xpath("(//a[@target='_blank'])[5]")).click();
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
		 driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		 ((JavascriptExecutor)driver).executeScript("scroll(0,-3000)");
		//WebElement xyz = driver.findElement(By.xpath("(//p[@class='micromini-container'])[3]//a"));
//		
//		
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", xyz);

		
		
		
	}

}
