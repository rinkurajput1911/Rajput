package BrowserOpen;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class X_pathAtribute
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("584555");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
