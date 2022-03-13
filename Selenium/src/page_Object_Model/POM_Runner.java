package page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.conf.configartion1;

public class POM_Runner {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
		WebDriver driver = new ChromeDriver();	
		driver.get(configartion1.appURL);
		driver.manage().window().maximize();
		
		LoginPagePOM login = new LoginPagePOM(driver);
		
		//TC01
		login.setUserId("Tester");
		
		login.setPassword("12345");
		
		login.clickLoginBtn();
		
		Thread.sleep(2000);
		///TC02
		driver.get(Configurations.appURL);
		login.setUserId("test@gmail.com");
		login.setPassword("225588");
		login.clickLoginBtn();
		
		///TC03
		Thread.sleep(2000);
		driver.get(Configurations.appURL);
		login.setUserId("Ramesh");
		login.setPassword("123456123456789");
		login.clickLoginBtn();
		
		
	}

		
		
	}


