package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class All_in1_webTable {
	
	public static void main(String[] args) {
		SetUp hh=new SetUp();
		WebDriver driver=hh.inDrive();
		driver.get("https://courses.letskodeit.com/practice");
         
		//row
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table[@name='courses']//tr[2]/td"));
		
		System.out.println(rowdata.size());
		 for (WebElement pp:rowdata)
		 {
			String actualText = pp.getText();
			System.out.print(actualText);
		 }
		
		 System.out.println("--------------");
		 
		 // 2 header data
		 WebElement header = driver.findElement(By.xpath("//table[@name='courses']//tr/th"));
		    System.out.println(header.getText());  
			
			
		 
		
		
	}
	
	
	
	  
	
	
	
	

}
