package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup2 {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
			
			Alert a=driver.switchTo().alert();
			System.out.println(a.getText());
			Thread.sleep(3000);
			a.sendKeys("selenium");
			Thread.sleep(4000);
			a.dismiss();
			
			driver.close();

	}
}
