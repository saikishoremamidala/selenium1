package actionsClass;

//imcomplete
  
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RightClickTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement input=driver.findElement(By.id("captchacharacters"));
		
		WebElement captcha=driver.findElement(By.xpath("//input[@id=\"captchacharacters\"]/parent::div/parent::div/child::div/child::img"));
		Thread.sleep(3000);

		String text=captcha.getText();
		Thread.sleep(3000);
		input.sendKeys(""+text+"");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		Thread.sleep(3000);
		
		WebElement deals=driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		Actions action=new Actions(driver);
		action.contextClick(deals).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
