package AutoSuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class redbus_autusuggestion {
	
	public static void main(String[] args) throws InterruptedException {
		SetUp hh=new SetUp();
		WebDriver driver=hh.inDrive();
		driver.get("https://www.redbus.in/bus-tickets");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtSource']")).sendKeys("Nagp");
               String  exptext="Nagpur (All Locations)";
               Thread.sleep(1000);
               driver.findElement(By.xpath("//ul[@id='C120_suggestion-wrap']/li[1]")).click();
}
}