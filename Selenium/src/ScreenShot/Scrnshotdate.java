package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Com.conf.configartion1;
import net.bytebuddy.utility.RandomString;

public class Scrnshotdate {
	
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(configartion1.ZerodhaURL);
		driver.manage().window().maximize();
	
		File sor = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String ref = RandomString.make(2);
		
//		Date dat=new Date();//Wed Feb 09 16:17:24 IST 2022
//		
//		 String image = dat.toString().replace(":", "_"); //Wed Feb 09 16_17_24 IST 2022
//		
		File des=new File("C:\\Automation\\ScreenShot\\"+ref+".jpg");
         FileHandler.copy(sor, des);
		
		
		
		
		// Date tim=new Date();
   // String dat = tim.toString().replace(":", "_");
//     Date dat=new Date();
//     Object file = dat.toString().replace(":","_");
//       
//		File des=new File("C:\\Automation\\ScreenShot\\"+t+".jpg");
//		FileHandler.copy(sorc, des);
//		
		}

}
