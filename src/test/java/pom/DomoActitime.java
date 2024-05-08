package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DomoActitime {
		//Declaration
		@FindBy(className="atLogoImg")
		private WebElement logo;
		
		@FindBy(name="username")
		private WebElement usernameTF;
		
		@FindBy(name="pwd")
		private WebElement passwordTF;
		
		@FindBy(id="loginButton")
		private WebElement loginbutton;
		
		
		//initialization
		public DomoActitime(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public WebElement getlLogo() {
			return logo;
		}
		public void setUsername(String username) {
			usernameTF.sendKeys(username);
		}
		public void setPassword(String password) {
			passwordTF.sendKeys(password);
		}
		public void clickLoginBtn() {
			loginbutton.click();
			
		}
		
}
