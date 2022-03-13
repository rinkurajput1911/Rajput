package I_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.conf.configartion1;

public class Practice_site {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframe-name");
		//driver.findElement(By.xpath("((//a[@class='dynamic-link'])[1])[1]")).click();
		((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
		//((JavascriptExecutor)driver).executeScript("scroll(0,-3000)");
	}

}
