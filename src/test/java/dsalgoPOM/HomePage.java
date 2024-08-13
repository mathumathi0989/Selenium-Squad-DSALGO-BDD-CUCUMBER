package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	    By dataStructuresLink = By.linkText("Data Structures");
	
	    By stackstart= By.xpath("//a[@href='stack']");
	    By queuestart= By.xpath("//a[@href='queue']");
	    By graphstart= By.xpath("//a[@href='graph']"); 
	    By logoutButton = By.xpath("//a[text()='Sign out']");


	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void selectDataStructures() {
	        driver.findElement(dataStructuresLink).click();
	        
	        //Add in select stack()-// driver.findElement(stackLink).click();

	    }

	    public void selectStack() {
	       	  driver.findElement(stackstart).click();
	          System.out.println(driver.getTitle());
	        
	    }
	    
	    public void selectQueue() {
	       	  driver.findElement(queuestart).click();
	          System.out.println(driver.getTitle());
	        
	    }
	    
	    public void selectGraph() {
	       	  driver.findElement(graphstart).click();
	          System.out.println(driver.getTitle());
	        
	    }
	    

	    public void clickLogoutButton() {
	        driver.findElement(logoutButton).click();
	    }
	    
	  
}
