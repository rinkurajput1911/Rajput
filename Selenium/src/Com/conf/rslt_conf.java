package Com.conf;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class rslt_conf {
	
	public static void main(String[] args) {
		                      // String keys         String value  
		System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(configartion1.appURL);
		driver.manage().window().maximize();
		
//		boolean s = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
//		System.out.println("------before clicking the button----");
//		System.out.println(s);
		
		driver.findElement(By.xpath("//a[contains(text(),'Already')]")).click();
		//driver.findElement(By.xpath("//a[@class='_9bq5']")).click();
//		boolean s1 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isEnabled();
//		System.out.println(s1);
				
		
	
	}

}
