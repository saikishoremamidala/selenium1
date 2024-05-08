package splclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(8000);
		
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.name("Email")).sendKeys("saikishoremamidala56@gmail.com"+Keys.TAB+"Erohsikias@141");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("search")).sendKeys("watch");
		driver.findElement(By.xpath("//*[name()=\"svg\"]/preceding-sibling::input")).click();
		driver.findElement(By.xpath("//span[text()='apple']")).click();
	}

}
