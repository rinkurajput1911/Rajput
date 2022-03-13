package BrowserOpen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.conf.configartion1;

public class Code_Optimization {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
         
		ChromeDriver driver = new ChromeDriver();
		driver.get(configartion1.appURL);
		driver.manage().window().maximize();
		
		WebElement kk = driver.findElement(By.xpath("//input[@type='radio']"));
		boolean hh0 = kk.isSelected();
		boolean hh1 = kk.isDisplayed();
		boolean hh2 = kk.isEnabled();
		System.out.println(hh0+"\n"+ hh1+"\n"+hh2);
		
}
}
