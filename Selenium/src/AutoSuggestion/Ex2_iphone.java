package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_iphone
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
		
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("iphone");
	Thread.sleep(2000);
	
	List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	System.out.println(alloptions.get(1).getText());
	String ExpText="iphone 13 price in india";
	
	for(int i=0;i<alloptions.size();i++)
	{
		String actText = alloptions.get(i).getText();
		System.out.println(actText);
		if(actText.equals(ExpText))
		{
			alloptions.get(i).click();
			break;
		}
	}
}
}
