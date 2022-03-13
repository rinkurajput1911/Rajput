package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driver_Initialization.SetUp;

public class fb_Listbox {
	public static void main(String[] args) {
		
		SetUp s=new SetUp();
		WebDriver driver = s.inDrive();
		driver.get("https://www.facebook.com/signup");
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Actions act=new Actions(driver);
		act.click(month).sendKeys(Keys.HOME).build().perform();
		
		act.click().sendKeys(Keys.ARROW_DOWN).build().perform();
		act.click().sendKeys(Keys.ARROW_DOWN).build().perform();
		act.click().sendKeys(Keys.ARROW_DOWN).build().perform();
		
	}

}
