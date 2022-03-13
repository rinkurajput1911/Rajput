package page_Object_Model;

import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class pom_test1_Runner 


{
	public static void main(String[] args) {
		SetUp ff=new SetUp();
		WebDriver driver = ff.inDrive();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		pom_test1 ww=new pom_test1(driver);
		
		ww.enterLN();
		ww.enterMO();
		ww.enterMONTH();
		ww.enterUS("rinku");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	        

}
