package List_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import Com.conf.configartion1;

public class ListBox_3 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(configartion1.appURL);
		driver.manage().window().maximize();
		 WebElement year = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel=new Select(year);
		int len = sel.getOptions().size();
		System.out.println(len);
  	for (int i=0; i<=len-1; i++)
		{
		String tex = sel.getOptions().get(1).getText();
		System.out.println(tex);}
		driver.close();

	}
//	           or
//	           List<WebElement> el = s.getOptions();
//	       	
//	       	for(WebElement o:el)
//	       	{
//	       		System.out.println(o.getText());
//	       	}
//	       	

}
