package List_box;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Com.conf.configartion1;

public class ListBox4 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://zerodha.com/margin-calculator/SPAN/");
	driver.manage().window().maximize();
	WebElement Exchange = driver.findElement(By.xpath("(//select[@class='in changer'])[1]"));
	Select s=new Select(Exchange);
	List<WebElement> el = s.getOptions();
	
	for(WebElement o:el)
	{
		System.out.println(o.getText());
	}
	
	Thread.sleep(2000);
	driver.close();
//	driver.quit();
	
}
}
