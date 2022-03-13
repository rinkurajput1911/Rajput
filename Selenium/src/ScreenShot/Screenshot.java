package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Com.conf.configartion1;
import net.bytebuddy.utility.RandomString;

public class Screenshot {
	
		public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(configartion1.ZerodhaURL);
		driver.manage().window().maximize();
		 
         	String str = RandomString.make(5);
         	
          File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          		
	File des= new File("C:\\Automation\\ScreenShot\\"+str+".jpg");
	FileHandler.copy(scr, des);
		
			//"C:\\Automation\\ScreenShot\\zerodha "+str+".jpg"
		
	}

}
