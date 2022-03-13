import Com.conf.configartion1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Status {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",configartion1.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(configartion1.appURL);
		driver.manage().window().maximize();
		//isselected, isdisplayed, enabled()
		driver.findElement(By.xpath("//input[@name='sex']")).click();
	 boolean os = driver.findElement(By.xpath("//input[@name='sex']")).isSelected();
	 System.out.println(os);
	 boolean os1 = driver.findElement(By.xpath("//input[@name='sex']")).isDisplayed();
	 System.out.println(os1);
	 boolean os2 = driver.findElement(By.xpath("//input[@name='sex']")).isEnabled();
	 System.out.println(os2);
	 Thread.sleep(3000);
	 driver.close();
		
		
		
		
		
	}

}
