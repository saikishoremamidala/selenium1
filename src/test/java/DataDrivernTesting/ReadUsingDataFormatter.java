package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadUsingDataFormatter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		Workbook wb=WorkbookFactory.create(fis);
		DataFormatter df=new DataFormatter();
		String text=df.formatCellValue(wb.getSheet("Sheet1").getRow(1).getCell(1));
		System.out.println(text);
		wb.close();
	}
}
