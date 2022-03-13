package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class RowSize {
	public static void main(String[] args) {
		
		SetUp dr=new SetUp();
        WebDriver driver = dr.inDrive();
driver.get("file:///D:/html/updated%20webtable.html");
 
/// row
   List<WebElement> rowsize = driver.findElements(By.xpath("//table[@id='123']//tr[3]/td")); 

     for ( WebElement kk:rowsize)  
     {
    	String rowdata= kk.getText();
    	System.out.print(" "+rowdata);
     }
   
   

	
		
		
		
		
		
	}

}
