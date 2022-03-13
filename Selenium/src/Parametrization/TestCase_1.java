package Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.conf.configartion1;

public class TestCase_1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// reading data
		FileInputStream file = new FileInputStream(configartion1.excelsheetPath);
	Sheet sh = WorkbookFactory.create(file).getSheet("Data");
				
			    String number = sh.getRow(6).getCell(3).getStringCellValue();
			 //String lastname = sh.getRow(2).getCell(1).getStringCellValue();
			System.out.println(number);
			 //  data enter in websit
			System.setProperty("webdriver.chrome.driver", configartion1.driverpath);
			WebDriver driver=new ChromeDriver();
			driver.get(configartion1.appURL);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(number);
			//driver.findElement(By.xpath("(//input[@data-type='text'])[2]")).sendKeys(lastname);
			
			
			
		}

	}


