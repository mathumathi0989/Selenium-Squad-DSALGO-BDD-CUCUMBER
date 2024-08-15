package dsalgoPOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

	public WebDriver driver;
	 WebDriverWait   wait;
	private By registerButton = By.xpath("//a[normalize-space()='Register']");
	private By uname = By.xpath("//input[@id='id_username']");
	private By pwd = By.xpath("//input[@id='id_password1']");
	private By pwdConfm = By.xpath("//input[@id='id_password2']");
	private By alert = By.xpath("//div[@role='alert']");
	
	 public RegisterPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	 public void registerButton() {
		 WebElement registerButton = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Register']")));
			registerButton.click(); }
	 
	 public void enterUsername(String username) {
	        driver.findElement(uname).sendKeys(username);
	    }
	 
	 
	 public void enterPassword(String password) {
	        driver.findElement(pwd).sendKeys(password);
	    }
	 
	 public void enterConfirmPassword(String Confirmpassword) {
	        driver.findElement(pwdConfm).sendKeys(Confirmpassword);
	    }
	 
	 public String getAlert() {
		return driver.findElement(alert).getText();
	 }
}
