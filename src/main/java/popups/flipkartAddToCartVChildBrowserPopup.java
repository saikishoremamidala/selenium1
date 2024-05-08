package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartAddToCartVChildBrowserPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//a[.='VIVO']")).click();
		driver.findElement(By.xpath("//div[text()='vivo V29e 5G (Artistic Red, 256 GB)']")).click();
		
		String parentId=driver.getWindowHandle();
		Set<String> childId = driver.getWindowHandles();
		
		for (String ids : childId) {
			driver.switchTo().window(ids);
			
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.close();
		
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		WebElement ele= driver.findElement(By.xpath("//a[text()='vivo V29e 5G (Artistic Red, 256 GB)']"));
		if(ele.isDisplayed())
			System.out.println("Item added to the cart");
		else
			System.out.println("Item is not added to the cart");
		driver.close();
		
		
	}

}
