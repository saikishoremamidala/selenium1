package splclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshopapp {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		Properties property=new Properties();
		property.put("FirstName", "Sai Kishore");
		property.put("Lastname", "Mamidala");
		property.put("Email", "saikishoremamidala56@gmail.com");
		property.put("Password", "1234567890@1");
		property.put("ConfirmPassword", "1234567890@1");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/data.properties");
		property.store(fos, "Updated Successfully");
		
		
		
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(property.getProperty("FirstName"));
		driver.findElement(By.id("LastName")).sendKeys(property.getProperty("Lastname"));
		driver.findElement(By.id("Email")).sendKeys(property.getProperty("Email"));
		driver.findElement(By.id("Password")).sendKeys(property.getProperty("Password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(property.getProperty("ConfirmPassword"));
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
