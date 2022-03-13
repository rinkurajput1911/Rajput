package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class complet_column {
	public static void main(String[] args) {

		SetUp uu = new SetUp();
		WebDriver driver = uu.inDrive();

		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		for (int i=2; i<=11; i++)
		{
			if(i==1)
			{
				String value=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th[1]")).getText();
				System.out.println( value+" ");
			}
			else
			{
				String value=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td[1]")).getText();
				System.out.println( value+" ");
			}
		}
	}

}
