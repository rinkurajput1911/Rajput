package List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	WebElement Month = driver.findElement(By.xpath("(//select[@name='birthday_day']"));
     	Select s1=new Select(Month);
     	boolean jj = s1.isMultiple();
     	System.out.println(jj);
     	
     	System.out.println(s1.getFirstSelectedOption());
	}
}
