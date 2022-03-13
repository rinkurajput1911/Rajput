package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driver_Initialization.SetUp;

public class Radio_button
{
  
	public static void main(String[] args) throws InterruptedException {
		SetUp ss=new SetUp();
		WebDriver driver=ss.inDrive();
		driver.get("https://courses.letskodeit.com/practice");
		  //radio button
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
		// single selected list box
		WebElement car = driver.findElement(By.xpath("//select[@name='cars']"));
		car.click();
		Thread.sleep(1000);
		Select oo=new Select(car);
		oo.selectByValue("bmw");
		System.out.println(oo.getFirstSelectedOption().getText());
		//multislected list box
		WebElement multi= driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
Select s=new Select(multi);				
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByIndex(1);
	  s.selectByIndex(2);		
		List<WebElement> all = s.getOptions();
		for(WebElement e:all)
		{
			System.out.println(e.getText());
		}
	}
  
}
