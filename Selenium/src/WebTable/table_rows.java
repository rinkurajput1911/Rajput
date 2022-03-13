package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class table_rows {
	
	public static void main(String[] args) {
		SetUp dr=new SetUp();
		        WebDriver driver = dr.inDrive();
		driver.get("file:///D:/html/webtable.html");
		 
		/// row
		List<WebElement> rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")); 
		
		System.out.println("---size of row"+ " " + rowsize.size());//4
		
		
		// Column
		
		List<WebElement> columnsize = driver.findElements(By.xpath("(//table[@id='1234']//tr)[1]/th"));
		System.out.println("---size of Column"+ " " + columnsize.size());//4

		// get 2nd row data
		
		List<WebElement> rowdata_2 = driver.findElements(By.xpath("(//table[@id='1234']//tr)[2]/td"));
		    for(WebElement hh:rowdata_2)
		    {
		    	System.out.print(hh.getText()+" ");   // for single row so remove ln
		    }
		    System.out.println("scond colmn data----- ");
//		    
//		     List<WebElement> clomndata_2 = driver.findElements(By.xpath("((//table[@id='1234']//tr)[4]/td[2])"));
//		       for ( int i=2; i<4; i++)  //row
//		       {
//		    	   for (int j=2; j<4; j++)
//		    	   {
//		    		   
//		    	   }
//		       }
		  //get 2nd column data
		     List<WebElement> clomndata_2 = driver.findElements(By.xpath("//table[@id='1234']//tr//td[2]"));
		    
		     for (  WebElement gg: clomndata_2 )
		     {
		    	 System.out.println(gg.getText());
		     }
		     
		   //get header & data from 2nd column 
		     
		   WebElement headerdata2 = driver.findElement(By.xpath("//table[@id='1234']//tr/th[2]")); 
		    System.out.println(headerdata2.getText());
		     
		     
		     
		     
		     
		     
		
	}

}
