package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class Angleone_sample1 {
	
	public static void main(String[] args) {
		
		SetUp yy= new SetUp();
		 WebDriver driver = yy.inDrive();
		driver.get("https://www.amazon.in/Redmi-Activ-Coral-Green-Storage/dp/B09GFLFMPS/ref=sr_1_5?crid=YCWVM4DX1FD4&keywords=mobile+under+10000&qid=1646134027&sprefix=mobile%2Caps%2C1309&sr=8-5");
//		 String element = driver.findElement(By.xpath("(//div[@class='row row-msd']/div)[1]")).getText();
//		System.out.println(element);
		String element = driver.findElement(By.xpath("(//div[@id='centerCol']//span)[9]")).getText();
		System.out.println(element);
		
		
	}
	
	

}
