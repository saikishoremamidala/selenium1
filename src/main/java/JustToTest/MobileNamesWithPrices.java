package JustToTest;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileNamesWithPrices {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("span._30XB9F")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("(//*[name()='svg'])[1]")).click();
		
		List<WebElement> mobilenames = driver.findElements(By.className("_4rR01T"));
		for(int i=0;i<mobilenames.size();i++) {
			String name=mobilenames.get(i).getText();
			String price=driver.findElement(By.xpath("//div[text()='"+name+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
			System.out.println(name+"\t"+price);
			
		}
		driver.close();
		
		
		
		////div[@class='_4rR01T']/parent::div/parent::div/descendant::div[@class="_30jeq3 _1_WHN1"]
	}

}
