package Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver_Initialization.SetUp;

public class dianamicElement {
	 public static void main(String[] args) {
		SetUp gg=new SetUp();
	WebDriver driver=gg.inDrive();
		 driver.get("https://www.amazon.in/Redmi-Note-11T-5G-Dimensity/dp/B09LJ12YNK/ref=sr_1_2?crid=18OPQZXEW3482&keywords=mobile&qid=1646069079&s=electronics&sprefix=mobil%2Caps%2C403&sr=1-2");
		String ff=driver.findElement(By.xpath("((//div[@class='info'])[5]//span)[4]")).getText();
		 System.out.println(ff);
	}
	
	

}
