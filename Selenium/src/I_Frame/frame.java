package I_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.conf.configartion1;

public class frame {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		//driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//driver.findElement(By.xpath("(//input[@data-type='text'])[2]")).sendKeys("jhgjhdj");
//		driver.switchTo().defaultContent();
//		driver.get("https://flcancer.okta.com/");
//		
	}
	
	
	
	
	

}
