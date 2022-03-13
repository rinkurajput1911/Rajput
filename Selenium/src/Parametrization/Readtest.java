package Parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readtest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {

		FileInputStream file=new FileInputStream("C:\\Automation\\Perameterise\\Excel\\Test.xlsx");
		       boolean data = WorkbookFactory.create(file).getSheet("Data").getRow(3).getCell(3).getBooleanCellValue();
		//		FileInputStream file=new FileInputStream("C:\\Automation\\Perameterise\\Excel\\Test.xlsx");
//	//  String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//	//  String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
//		  //double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
//		//boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(3).getBooleanCellValue();
//		 CellType data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getCellType();
                	
		System.out.println(data);
	}

	
}

