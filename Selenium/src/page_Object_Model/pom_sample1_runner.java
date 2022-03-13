package page_Object_Model;

import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class pom_sample1_runner {
	
	public static void main(String[] args) 
	{
		
		SetUp hh=new SetUp();
	WebDriver driver=	hh.inDrive();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	pom_sample1 yy=new pom_sample1(driver);
	
		yy.username();
		yy.password();
		yy.login();
		
		
		
		
		
		
		
		
		
		
		
	}

}
