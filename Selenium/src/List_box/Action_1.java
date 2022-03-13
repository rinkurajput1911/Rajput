package List_box;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Com.conf.configartion1;

public class Action_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(configartion1.appURL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Actions acts = new Actions(driver);
// to get the keyboard access we passes driver as argument
		acts.moveToElement(day).perform();
		Thread.sleep(2000);
		acts.click().perform();
		
		Thread.sleep(2000);
		
		for(int i=0; i<=13; i++) {
		
		acts.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		
		
		}
		acts.sendKeys(Keys.ENTER).perform();
		
		
	}

	}