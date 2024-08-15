package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	    By prepareinterviestart=By.xpath("//a[@href='/home']");
	
	    By dataStructuresLink = By.linkText("Data Structures");
	
	    By stackstart= By.xpath("//a[@href='stack']");
	    By queuestart= By.xpath("//a[@href='queue']");
	    By graphstart= By.xpath("//a[@href='graph']"); 
	    By arraystart= By.xpath("//a[@href='array']");
	    By linkedliststart= By.xpath("//a[@href='linked-list']"); 
	    By treestart= By.xpath("//a[@href='tree']"); 
	    By datastructurestart= By.xpath("//a[@href='data-structures-introduction']"); 

	    By signout=By.linkText("Sign out");
	    By register=By.xpath("//a[text()=' Register ']");

     // Drop down  DS list elements
		By dropDS = By.xpath("//a[text()='Data Structures']");
		By dropArray = By.xpath("//a[text()='Arrays']");
		By dropLinkedlist = By.xpath("//a[text()='Linked List']");
		By dropStack = By.xpath("//a[text()='Stack']");
		By dropQueue = By.xpath("//a[text()='Queue']");
		By dropTree = By.xpath("//a[text()='Tree']");
		By dropgraph = By.xpath("//a[text()='Graph']");
		
		By alertmsg=By.xpath("//div[@class='alert alert-primary']") ;

	    
	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    
	    public void dropdown(String string) {

	        driver.findElement(dropDS).click();

			switch (string) {
			case "Arrays":
				
				 driver.findElement(dropArray).click();
				break;
			case "Linkedlist":
				
				 driver.findElement(dropLinkedlist).click();
				break;
			case "Stack":
				
				 driver.findElement(dropStack).click();
				break;
			case "Queue":
				
				 driver.findElement(dropQueue).click();
				break;
			case "Tree":
				
				 driver.findElement(dropTree).click();
				break;
			case "Graph":
				
				 driver.findElement(dropgraph).click();
				break;
			}

		}
	    
	    public void getStartedForModule(String string) {
			switch(string){
			case "Datastructures":
		        driver.findElement(dropDS).click();
				break;
			case "Arrays":
				
				 driver.findElement(dropArray).click();
				break;
			case "Linkedlist":
				
				 driver.findElement(dropLinkedlist).click();
				break;
			case "Stack":
				
				 driver.findElement(dropStack).click();
				break;
			case "Queue":
				
				 driver.findElement(dropQueue).click();
				break;
			case "Tree":
				
				 driver.findElement(dropTree).click();
				break;
			case "Graph":
				
				 driver.findElement(dropgraph).click();
				break;
			}
			}
	    
	    public void alertmsg(String msg) {
			 msg=driver.findElement(alertmsg).getText();
			System.out.println(msg);
		}
		
		
	    public void clickstart() {
	    	
	    	WebElement prepstart= driver.findElement(prepareinterviestart);
	    	prepstart.click();
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
