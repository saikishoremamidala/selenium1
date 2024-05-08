package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShoppersstackSplClas {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(6000);
		
		driver.findElement(By.id("men")).click();
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.xpath("//span[text()='Men Regular Fit Solid Cut Away Coll...']"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		action.click().perform();
		
		driver.getTitle();
		driver.close();
	}

}
