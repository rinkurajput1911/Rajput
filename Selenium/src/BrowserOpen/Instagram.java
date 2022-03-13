package BrowserOpen;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
//		SearchContext rr=new ChromeDriver();
//		 rr.notify();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gaana.com/");
		driver.manage().window().maximize();


	}

}
