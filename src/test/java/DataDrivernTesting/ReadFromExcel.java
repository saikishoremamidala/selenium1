package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1: convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/excel/Book 1.xlsx");
		//step 2:open workbook
		//WorkbookFactory.create(fis)-->throws EncrytedDocumentException and 
		Workbook wb= WorkbookFactory.create(fis);
		
		//step 3:Get control over sheet
		Sheet sh=wb.getSheet("Sheet1");
		
		//step 4:Get control over row
		Row r= sh.getRow(3);
		Row r1=sh.getRow(1);
		
		//step 5:Get control over cell
		Cell c=r.getCell(1);
		Cell c1=r1.getCell(1);
		
		//step 6:Read Data
		System.out.println(c.getNumericCellValue());
		System.out.println(c1.getStringCellValue());
		
		wb.close();
	}

}
