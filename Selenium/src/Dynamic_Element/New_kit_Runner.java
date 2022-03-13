package Dynamic_Element;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver_Initialization.SetUp;

public class New_kit_Runner {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		SetUp jj=new SetUp();
		WebDriver driver=jj.inDrive();
		driver.get("https://kite.zerodha.com/#loggedout");
		
		Utility ww=new Utility();
		    
		
		new_Kite_login ii=new new_Kite_login(driver);
		ii.enterUN(ww.excelsheet(1, 0));
		ii.enterPS(ww.excelsheet(1, 1));
		ii.clickButton();
		 Thread.sleep(2000);
		
		 new_kite_PIN  qq=new new_kite_PIN (driver);
		qq.enterPIN(ww.excelsheet(1, 2));
		qq.clickPINbutton();
		//Thread.sleep(1000); //static wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		DianamicElement_BJF  ff=new DianamicElement_BJF(driver);
		ff.element();
		
		
		
		
	}
	
	

}
