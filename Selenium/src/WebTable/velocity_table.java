package WebTable;

import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class velocity_table {
	public static void main(String[] args) {
		
		SetUp uu = new SetUp();
		WebDriver driver = uu.inDrive();

		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
	}

}
