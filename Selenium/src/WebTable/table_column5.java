package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class table_column5 {
	public static void main(String[] args) {
		SetUp uu=new SetUp();
		WebDriver driver=uu.inDrive();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		for (int i=1 ; i<=11; i++) 
		{
			if(i==1)
			{
				String column=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/th[1]")).getText();
				System.out.println(column);                ////table[@id='product']//tr[1]/th[1]
			}
			else {
			
			String column=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/th[1]")).getText();
	System.out.println(column);
			}
		
		}
			
			
			
	}

}
