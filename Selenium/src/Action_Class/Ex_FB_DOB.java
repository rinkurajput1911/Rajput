package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driver_Initialization.SetUp;

public class Ex_FB_DOB 
{
public static void main(String[] args) throws InterruptedException
{
	SetUp s=new SetUp();
	WebDriver driver = s.inDrive();
	driver.get("https://www.facebook.com/");
	Actions act=new Actions(driver);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement dob = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	act.moveToElement(dob).click().build().perform();
	
	act.sendKeys(Keys.HOME).perform();
	act.sendKeys(Keys.DOWN).perform();
	Thread.sleep(2000);
	
	act.sendKeys(Keys.ENTER).perform();
	
	
}
}
