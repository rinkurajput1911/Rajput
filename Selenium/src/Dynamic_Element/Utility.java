package Dynamic_Element;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Com.conf.configartion1;

public class Utility {
	
	public String excelsheet(int row, int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(configartion1.excelsheetPath);
		Sheet sh = WorkbookFactory.create(file).getSheet("Data");
		String len = sh.getRow(row).getCell(cellnum).getStringCellValue();
		       return len;
		
	}
	

}
