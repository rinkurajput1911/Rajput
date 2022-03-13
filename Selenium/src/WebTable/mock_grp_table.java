package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class mock_grp_table 
{
   public static void main(String[] args) {
	
	   SetUp jj=new SetUp();
		WebDriver driver=jj.inDrive();
		driver.get("file:///D:/html/updated%20webtable.html");
	for (int i=1; i<=6; i++)  //for each row 
	{
		for (int j=1; j<=4; i++) // for each raw cell
		{ if(i==1) {
			String data=driver.findElement(By.xpath("///table[@id='123']//tr["+i+"]//th["+j+"]")).getText();
		System.out.println(data +"  ");}
		else
		{
			String data=driver.findElement(By.xpath("//table[@id='123']//tr["+i+"]//td["+j+"]")).getText();
			System.out.println(data +"  ");
		}
		
		}
		System.out.println();
	}
	
		
	   
	   
	   
}
}
