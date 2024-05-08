package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select s=new Select(dropdown);
		
		if(s.isMultiple()) {
			s.selectByIndex(0);
			s.selectByValue("99");
			s.selectByVisibleText("INR 200 - INR 299 ( 3 )");
			Thread.sleep(3000);
			
			System.out.println("First Selected Element : "+s.getFirstSelectedOption().getText());
			List<WebElement> selectedOptions=s.getAllSelectedOptions();
			System.out.println("************** Selected Options *********************");
			
			for (WebElement option : selectedOptions) {
				System.out.println(option.getText());
				
			}
			System.out.println(s.getWrappedElement().getText());
//			s.deselectByIndex(0);
//			s.deselectByValue("99");
//			s.deselectByVisibleText("INR 200 - INR 299 ( 3 )");
			
		//	s.deselectAll();
			
		}
		else {
			System.out.println("Single Select Dropdown");
		}
		driver.close();
	}

}
