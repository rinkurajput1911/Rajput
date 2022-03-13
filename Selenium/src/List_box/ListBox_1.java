package List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	WebElement Month = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
     	Select s1=new Select(Month);
//		s1.selectByValue("2019");
//		//s1.selectByIndex(4);
		s1.selectByVisibleText("Anubhuti Class (EA)");
		
	}

}
