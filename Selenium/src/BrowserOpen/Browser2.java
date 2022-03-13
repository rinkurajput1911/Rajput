package BrowserOpen;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
//		SearchContext rr=new ChromeDriver();
//		 rr.notify();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.gaana.com/");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//driver.manage().window().minimize();
		//Thread.sleep(5000);
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		//Thread.sleep(3000);
	driver.navigate().back();
		//Thread.sleep(5000);
//		driver.navigate().forward();
//	Thread.sleep(500);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
//		Dimension dim=new Dimension(200, 300); 
//		driver.manage().window().setSize(dim);
//		Thread.sleep(500);
//		Point p=new Point(200, 200);
//		driver.manage().window().setPosition(p);
//		Thread.sleep(5000);

		//driver.quit();

	}
}
