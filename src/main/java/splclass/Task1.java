package splclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(8000);
		
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.name("Email")).sendKeys("saikishoremamidala56@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Erohsikias@141");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Levis Mens Regular Fit Tee'])[1]")).click();
		driver.findElement(By.id("Add To Cart")).click();
		
		driver.findElement(By.id("cart")).click();
		
		WebElement ele= driver.findElement(By.xpath("//p[text()='Levis Mens Regular Fit Tee']"));
		if(ele.isDisplayed()) {
			System.out.println("Item is added to cart is successful");
		}
		else {
			System.out.println("Item is not added to cart");
		}
		driver.close();
	}

}
