package Dynamic_Element;

import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class ExNSCRunner
{
public static void main(String[] args)
{
	SetUp gg=new SetUp();
	 WebDriver driver=gg.inDrive();
	 
	 driver.get("https://www.nseindia.com/");
	 
	 ExNSEpage nse=new ExNSEpage(driver);
			nse.getBankNifty(); 
	 
}
}
