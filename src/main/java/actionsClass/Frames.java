package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element=driver.findElement(By.xpath("//span[.='Sign In']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		WebElement ele=driver.findElement(By.xpath("//a[.='login']"));
		if(ele.isEnabled())
			System.out.println("enabled");
		
		driver.findElement(By.xpath("//a[.=\'login\']")).click();
		
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.id("userName")).sendKeys("9676626070");
		
		
		driver.close();
		
	}

}
