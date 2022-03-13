package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Com.conf.configartion1;
import net.bytebuddy.utility.RandomString;

public class Sample1
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://zerodha.com/margin-calculator/SPAN/");
	String name = RandomString.make(5);
	//File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File source = driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Automation\\ScreenShot\\zerodha.jpg "+name+".jpg");
	
	FileHandler.copy(source, dest);
	Thread.sleep(4000);
	
	driver.quit(); 
	
	
}
}
