package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	    By dataStructuresLink = By.linkText("Data Structures");
	
	    By stackstart= By.xpath("//a[@href='stack']");
	    By queuestart= By.xpath("//a[@href='queue']");
	    By graphstart= By.xpath("//a[@href='graph']"); 
	    By arraystart= By.xpath("//a[@href='array']");
	    By linkedliststart= By.xpath("//a[@href='linked-list']"); 
	    By treestart= By.xpath("//a[@href='tree']"); 
	    By datastructurestart= By.xpath("//a[@href='data-structures-introduction']"); 

	    By signout=By.linkText("Sign out");
	    private By register=By.xpath("//a[text()=' Register ']");


	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void selectDataStructuresdropdwon() {
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
	    
	    public void selectTree() {
	       	  driver.findElement(treestart).click();
	          System.out.println(driver.getTitle());
	        
	    }
	    public void selectArray() {
	       	  driver.findElement(arraystart).click();
	          System.out.println(driver.getTitle());
	        
	    }  
	    
	    public void selectLinkedList() {
	       	  driver.findElement(linkedliststart).click();
	          System.out.println(driver.getTitle());
	        
	    } 
	    
	    public void selectDataStructure() {
	       	  driver.findElement(datastructurestart).click();
	          System.out.println(driver.getTitle());
	        
	    }
	    public void clickSignoutButton() {
	        driver.findElement(signout).click();
	    }
	    public void register() {
	        driver.findElement(register).click();
	    } 
	  
}
