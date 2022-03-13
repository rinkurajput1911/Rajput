package AutoSuggestion;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class Car_Dekho {
	
	public static void main(String[] args) throws InterruptedException {
		
		  SetUp jj=new SetUp();
		     WebDriver driver=jj.inDrive();
		     driver.get("https://www.google.co.in/");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("car ");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("((//ul[@class='G43f7e'])[1]/li)[1]")).click();
		
		
	}

}
