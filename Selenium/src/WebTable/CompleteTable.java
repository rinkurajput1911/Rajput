package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class CompleteTable {
	
	public static void main(String[] args) {
		
		SetUp mm=new SetUp();
		WebDriver driver=mm.inDrive();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		for(int i=1;i<=11;i++)	//row--->11 | 1 row header tag-->th  2-11-->td
		{
			for(int j=1;j<=3;j++) //Particular row no cell--->3
			{
				if(i==1)
				{
					String value = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText();	
					System.out.print(value+"  ");
				}
				else
				{
					String value = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();	
					System.out.print(value+"  ");
				}
			
			}
			System.out.println("|||");
		}
	
		
	}

}
