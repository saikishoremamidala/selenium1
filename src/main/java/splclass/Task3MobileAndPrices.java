package splclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3MobileAndPrices {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", null);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> ele = driver.findElements(By.xpath(""));
		List<WebElement> elepri = driver.findElements(By.xpath("//div[@class='_4rR01T']/parent::div/parent::div/descendant::div[@class=\"_30jeq3 _1_WHN1\"]"));
		

		FileInputStream fis=new FileInputStream("./src/test/resources/excel/Book 2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("mysheet");
		for(int i=0;i<elepri.size();i++) {
			String mobile=ele.get(i).getText();
			String price;
			
			FileOutputStream fos=new FileOutputStream("./src/test/resources/excel/Book 2.xlsx");

		}
	}
				
		

}
	
