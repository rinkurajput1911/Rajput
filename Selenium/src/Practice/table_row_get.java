package Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class table_row_get {
	
	public static void main(String[] args) {
		SetUp ii=new SetUp();
		WebDriver driver=ii.inDrive();
		driver.get("file:///D:/html/updated%20webtable.html");
		//row
		
		List<WebElement> data = driver.findElements(By.xpath("(//table[@id='123']//tr)[4]/td"));
		System.out.println("size of 4rth row"+" " +data.size());
		       
		System.out.println("---------------------");
		for(int i=0; i<data.size(); i++)
		         {
		        	String ss=data.get(i).getText();
		        	System.out.println(ss);
		         }
		              
//		for(WebElement uu:data)   //for each
//		{ 
//			String actualdata = uu.getText();
//			System.out.print(" "+actualdata);
//			
//		}
		
	}

}
