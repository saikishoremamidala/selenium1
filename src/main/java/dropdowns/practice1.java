package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dropdown=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dropdown);
		
		if(s.isMultiple())
			System.out.println("Multi Select Dropdown");
		else
			System.out.println("Single Select Dropdown");
		
		s.selectByIndex(6);
		Thread.sleep(3000);
		s.selectByValue("625");
		Thread.sleep(3000);
		s.selectByVisibleText("Baby");
		Thread.sleep(3000);

		System.out.println("-------------------------------");
		List<WebElement> list = s.getOptions();
		for(WebElement e:list) {
			System.out.println(e.getText());
		}
		driver.close();
		
	}

}
