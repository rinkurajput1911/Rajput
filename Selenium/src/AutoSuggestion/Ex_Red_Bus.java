package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_Red_Bus
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("na");
	Thread.sleep(2000);
	List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
	
	String ExpText="Nashik";
	for(WebElement s1:alloptions)
	{
		String actText=s1.getText();
		if(actText.contains(ExpText))
		{
			s1.click();
			break;
		}
	}
}
}
