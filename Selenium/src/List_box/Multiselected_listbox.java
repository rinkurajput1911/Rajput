package List_box;

import java.util.List;

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
			//System.out.println(data.getText());
 		 Select gg=new Select(data);
//				System.out.println(gg.isMultiple());
		gg.selectByIndex(0);
			gg.selectByIndex(1);
			List<WebElement> rr = gg.getAllSelectedOptions();
			for(WebElement pp: rr)
			{
				System.out.println(pp.getText());
			}
//			System.out.println("1st slected----" +gg.getFirstSelectedOption().getText());
//			gg.getAllSelectedOptions();
//			System.out.println(gg.getOptions().size());
				//for( yy:data)
			
			
				
	}

}
