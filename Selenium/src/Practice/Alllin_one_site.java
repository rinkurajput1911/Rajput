package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class Alllin_one_site {
	
	public static void main(String[] args) {
		
		 SetUp jj=new SetUp();
	     WebDriver driver=jj.inDrive();
	     driver.get("file:///D:/html/updated%20webtable.html");
	//	row size
	     
	     List<WebElement> row = driver.findElements(By.xpath("//table[@id='123']//tr"));
		    System.out.println("table row size-----" +row.size());
		    
		   // 5th row data
		    List<WebElement> rowdata = driver.findElements(By.xpath("//table[@id='123']//tr[3]/td"));
		  System.out.println("table clumn size-----"  +rowdata.size());
		    for(WebElement gg:rowdata)
		   {     
			  System.out.print(" "+gg.getText()); 
			    }
		    
		    //header data
		    List<WebElement> headerdata = driver.findElements(By.xpath("//table[@id='123']//tr[1]/th"));
		    
		    System.out.println("-------------------");
		    for(WebElement oo:headerdata)
			   {     
				  System.out.print(" "+oo.getText()); 
				    }
	}
	
	
	

}
