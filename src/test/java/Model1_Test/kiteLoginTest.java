package Model1_Test;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFile.BaseClass;

public class kiteLoginTest extends BaseClass
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("--open browser--");
		initilizeBrowser();
	}

	@BeforeMethod
	public void logintoApp()
	{
		
	}
	



}
