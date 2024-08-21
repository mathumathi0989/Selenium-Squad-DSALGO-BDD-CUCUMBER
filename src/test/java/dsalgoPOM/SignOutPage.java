package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutPage {
	
	public WebDriver driver;

	private By signOut = By.xpath("//a[text()='Sign out']");
    private By SignoutAlertMsg = By.xpath(" //div[@role='alert']");

    
    
    public SignOutPage(WebDriver driver) {
        this.driver = driver;
    }
    
    


}
