package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class Velocity_tableA {
	public static void main(String[] args) {
		
		SetUp uu=new SetUp();
		WebDriver driver=uu.inDrive();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		for (int i=2 ; i<=11; i++) // for row 
		{
			for (int j=1 ; j<=3; j++) // for each cell
			{
				
				if(i==1)
				{
					String data=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/th["+j+"]")).getText();
				      System.out.print(data +" ");
				}
				
				else
				{
				
				String data=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]")).getText();
			      System.out.print(data +" ");
				}
			}
			System.out.println();
		}
	  }
	}
