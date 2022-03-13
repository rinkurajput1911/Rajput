package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_redmi
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");

	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Redmi");
	Thread.sleep(2000);
	List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));

	String ExpectedText = "redmi 9 power";
	
	for(WebElement s1:alloptions)
	{
		String actText=s1.getText();
		
		System.out.println(actText);
		
		if(ExpectedText.equals(actText))
		{
			s1.click();
			break;
		}
	}
	
}
}
