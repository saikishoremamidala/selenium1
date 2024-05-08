package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("//ul[@class]/descendant::a[.=' SkillRary Essay']")).click();
		
		String parentId=driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		
		for (String wid : ids) {
			driver.switchTo().window(wid);
			
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("mytext")).sendKeys("ksihore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]")).click();
		driver.close();
		driver.switchTo().window(parentId);
		
		driver.findElement(By.name("q")).sendKeys("core java");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"go\"]")).submit();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
