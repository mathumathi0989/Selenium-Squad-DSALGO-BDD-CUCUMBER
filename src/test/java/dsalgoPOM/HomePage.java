package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	    By dataStructuresLink = By.linkText("Data Structures");
	    By stackLink = By.linkText("Stack");
	    By queueLink = By.linkText("Queue");
	    By logoutButton = By.xpath("//a[text()='Sign out']");


	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void selectDataStructures() {
	        driver.findElement(dataStructuresLink).click();
	    }

	    public void selectStack() {
	        driver.findElement(stackLink).click();
	    }

	    public void clickLogoutButton() {
	        driver.findElement(logoutButton).click();
	    }
	    
	    public void selectQueue() {
	        driver.findElement(queueLink).click();
	    }

}
