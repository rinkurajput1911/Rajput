package Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class Angelone_test {
	
	public static void main(String[] args) {
		SetUp jj=new SetUp();
		WebDriver driver=jj.inDrive();
		driver.get("https://trade.angelbroking.com/");
			String element=driver.findElement(By.xpath("(//div[@class='row row-msd']//div)[2]")).getText();
			System.out.println(element);
		
	}

}
