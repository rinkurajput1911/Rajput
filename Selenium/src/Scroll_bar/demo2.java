package Scroll_bar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.conf.configartion1;

public class demo2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://zerodha.com/margin-calculator/SPAN/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement xyz = driver.findElement(By.xpath("(//p[@class='micromini-container'])[3]//a"));
		
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", xyz);
  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", xyz);
	((JavascriptExecutor)driver).executeScript("scroll(0,-1000)");	
		}

}
