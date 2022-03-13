package Action_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class Ex_AutoSuggestion
{
public static void main(String[] args) throws InterruptedException
{

	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Rolex");

	String ExpText="rolex watches for men";
	Thread.sleep(2000);
		List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));

	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions act=new Actions(driver);
	
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	Thread.sleep(2000);
	
	for(int i=0;i<=20;i++)
	{
		act.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		
	}
	

}
}
