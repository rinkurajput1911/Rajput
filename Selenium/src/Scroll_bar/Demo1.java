package Scroll_bar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.conf.configartion1;

public class Demo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://zerodha.com/margin-calculator/SPAN/");
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		
		Thread.sleep(1000);((JavascriptExecutor)driver).executeScript("scroll(0,-1000)");
		
		
	}

}
