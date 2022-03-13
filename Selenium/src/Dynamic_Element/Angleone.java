package Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class Angleone {
	
	public static void main(String[] args) {
		SetUp jj=new SetUp();
		WebDriver driver=jj.inDrive();
	driver.get("https://trade.angelbroking.com/");
		String element=driver.findElement(By.xpath("//div[@id='divmainSensex']")).getText();
		System.out.println(element);
		
		
		
		
		
	}

}
