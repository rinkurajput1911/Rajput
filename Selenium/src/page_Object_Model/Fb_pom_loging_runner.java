package page_Object_Model;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import Dynamic_Element.Utility;
import driver_Initialization.SetUp;

public class Fb_pom_loging_runner {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		SetUp ss=new SetUp();
	    WebDriver driver=ss.inDrive();
		driver.get("https://www.facebook.com/");
		Utility yy=new Utility();
		Fb_pom_loging uu=new Fb_pom_loging(driver);
		//Thread.sleep(1000);
		uu.enterUN(yy.excelsheet(2, 0));
		
		
		
	}

}
