package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driver_Initialization.SetUp;

public class Multiselected_listbox {
	
	public static void main(String[] args) {
		SetUp hh=new SetUp();
		WebDriver driver=hh.inDrive();
		driver.get("https://courses.letskodeit.com/practice");
			WebElement data = driver.findElement(By.xpath("//select[@id='multiple-select-example']"));	
				System.out.println(data.getText());
			 Select gg=new Select(data);
				System.out.println(gg.isMultiple());
//			gg.selectByIndex(0);
//			gg.selectByIndex(2);
			//gg.getAllSelectedOptions();
			
				//for( yy:data)
				{
					
				}
				
				
	}

}
