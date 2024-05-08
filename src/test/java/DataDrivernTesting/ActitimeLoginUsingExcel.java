package DataDrivernTesting;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginUsingExcel {

		public static Map<String, String> read(){
			FileInputStream fis=null;
			Workbook wb=null;
			Sheet sh=wb.getSheet("Sheet1");
			DataFormatter df=new DataFormatter();
			Map<String, String> map = new HashMap<String ,String>();
			for(int i=0;i<=sh.getLastRowNum();i++) {
				String key=df.formatCellValue(sh.getRow(i).getCell(0));
				String value=df.formatCellValue(sh.getRow(i).getCell(1));
				map.put(key, value);
			}
			System.out.println(map);
			return map;
			}

		public static void main(String[] args) {
			Map<String, String> map=read();
			System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get(map.get("url"));
			
			long time=Long.parseLong(map.get("time"));
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			
			driver.findElement(By.id("username")).sendKeys(map.get("username"));
			driver.findElement(By.name("pwd")).sendKeys(map.get("password"));
			driver.findElement(By.id("loginButton")).click();
			
			WebDriverWait wait=new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
			driver.close();
		}
}
