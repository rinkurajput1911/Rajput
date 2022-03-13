package driver_Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
	
	public WebDriver inDrive()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		return driver;
	}

}
