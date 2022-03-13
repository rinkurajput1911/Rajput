package Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Com.conf.configartion1;

public class ReadExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// reading data
		FileInputStream file = new FileInputStream(configartion1.excelsheetPath);
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		short len = sh.getRow(3).getLastCellNum();
		//sh.getLast
		for (int i = 0; i <= len - 1; i++) {

			String firstName = sh.getRow(i).getCell(1).getStringCellValue();

			System.out.println(firstName);
		}

	}

}
