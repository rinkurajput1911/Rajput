package Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class moneycontrol {
	
	public static void main(String[] args) {
		SetUp hh=new SetUp();
		WebDriver driver=hh.inDrive();
		driver.get("https://www.moneycontrol.com/markets/global-indices/");
		String element=driver.findElement(By.xpath("(//li[@class='clearfix'])[2]")).getText();
		System.out.println(element);
		
		
		
		
		
		
		
		
	}

}
