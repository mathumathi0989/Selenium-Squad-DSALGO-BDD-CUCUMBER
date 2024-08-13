package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutPage {
	
	public WebDriver driver;

	private By signIn = By.xpath("//a[normalize-space()='Sign in']");
    private By passwordField = By.xpath("//input[@id='id_password']");
    private By userNameField = By.xpath("//input[@id='id_username']");
    private By loginButton = By.xpath("//input[@value='Login']");

    public SignOutPage(WebDriver driver) {
        this.driver = driver;
    }

}
