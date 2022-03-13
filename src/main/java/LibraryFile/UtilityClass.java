package LibraryFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String getTD(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Smit_Maven\\TestData\\Test.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Data").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static void CapctureScreenshot(int TCID,WebDriver driver) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Smit_Maven\\ScreenShot\\TestCaseID"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}
	
	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Smit_Maven\\PropertyFile.properties");
		Properties pr=new Properties();
		pr.load(file);
		String value = pr.getProperty(key);
		return value;
	}
}
