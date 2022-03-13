package List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Com.conf.configartion1;

public class ActionClass2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(configartion1.appURL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Actions acts = new Actions(driver);
		
		
		
		
	}

}
