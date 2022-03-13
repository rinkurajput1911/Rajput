package Popp_UP;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xyz {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12122");
		
		
}
	}
