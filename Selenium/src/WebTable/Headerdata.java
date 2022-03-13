package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class Headerdata {
	
	public static void main(String[] args) {
		
		
		
		SetUp dr=new SetUp();
        WebDriver driver = dr.inDrive();
driver.get("file:///D:/html/updated%20webtable.html");
 
/// column
   List<WebElement> clomn = driver.findElements(By.xpath("//table[@id='123']//th")); 


 for(WebElement ll:clomn)
 {
	 String  data=ll.getText();
	 System.out.print(" "+data);
 }

	
	}

}
