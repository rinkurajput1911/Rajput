package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class complete_column_data {
	
	public static void main(String[] args) {
		SetUp dr=new SetUp();
        WebDriver driver = dr.inDrive();
driver.get("file:///D:/html/updated%20webtable.html");
 
/// column


 for(int i=1; i<=6; i++)
 {
//	    WebElement clumndata = driver.findElement(By.xpath("//table[@id='123']//tr["+i+"]/td[1]")); 
//       System.out.println(clumndata.getText());
//       //               runtime xpath
       if(i==1)
       {
    	   WebElement clumndata = driver.findElement(By.xpath("//table[@id='123']//tr["+i+"]/th[1]")); 
           System.out.println(clumndata.getText());
       }
       else
       {
    	   WebElement clumndata = driver.findElement(By.xpath("//table[@id='123']//tr["+i+"]/th[1]")); 
           System.out.println(clumndata.getText());  
       }
 }


		
		
		
		
		
		
	}

}
