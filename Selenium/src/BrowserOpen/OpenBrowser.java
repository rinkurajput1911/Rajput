package BrowserOpen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();
driver.get("https://www.ganna.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.manage().window().maximize();
//Thread.sleep(5000);
driver.navigate().refresh();
driver.manage().window().minimize();
//Thread.sleep(5000);
driver.close();


}
}
