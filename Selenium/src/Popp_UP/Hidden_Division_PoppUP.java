package Popp_UP;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_PoppUP {
	//https://demoqa.com/alerts
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	String rr = driver.switchTo().alert().getText();
		System.out.println(rr);
		 driver.switchTo().alert().accept();
		 Thread.sleep(1000);
		 driver.switchTo().alert().accept();

}}
