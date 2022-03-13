package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class webtable_row {
	public static void main(String[] args) {

		SetUp dr = new SetUp();
		WebDriver driver = dr.inDrive();
		driver.get("file:///D:/html/updated%20webtable.html");

/// row
		List<WebElement> rowsize = driver.findElements(By.xpath("//table[@id='123']//tr[2]/td"));
	    System.out.println(rowsize.size());
		for (WebElement pp:rowsize)
		{
			String data=pp.getText();
			System.out.print(" " +data );
		}
	
	// column
		
	
	
	
	
	}
}
