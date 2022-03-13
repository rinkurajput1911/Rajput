package BrowserOpen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_pathbyText
{                                            
     public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQzODY2MjA5LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Rinku");// x-path by indexloctor
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rajput"); //x-path by attribut
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("123456789");// x-path by indexloctor
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("rinkurajput1911@gmail"); //x-path by attribut
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();  //x-path by text
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[contains(text(),'Up')]")).click();  //x-path by contains
//		Thread.sleep(3000);
		
	
		driver.close();
	}
	
	
}
