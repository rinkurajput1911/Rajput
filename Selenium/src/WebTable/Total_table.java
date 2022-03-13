package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class Total_table {
	
	public static void main(String[] args) throws InterruptedException {
		SetUp uu=new SetUp();
		WebDriver driver=uu.inDrive();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");

		//complet table data
		for(int i=1; i<=11; i++) // for each row
	{
		for(int j=1; j<=3; j++) // for each row cell
		{
			if(i==1)
			{
				String data=driver.findElement(By.xpath("((//div[@class='marketwatch-sidebar marketwatch-wrap']//div//div//div//div//div)[1]//span[1])[1]")).getText();
			     System.out.print(data +" "); 
			}
			else
			{
			String data=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
			 System.out.print(data +" "); }            //table[@id='product']//tr[2]//td[1]
		} System.out.println();
		
	}
//	Thread.sleep(1000);
//    WebElement data = driver.findElement(By.xpath("//table[@id='product']//tr[1]"));
//		System.out.println(data.getText());
	}

}
