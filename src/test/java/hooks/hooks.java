package hooks;



import dsUtilities.ConfigReader;
import dsUtilities.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import org.openqa.selenium.WebDriver;

public class hooks {


	 WebDriver driver;

	    @Before
	    public void setUp() {
	        driver = DriverManager.getDriver(new ConfigReader().getProperty("browser"));
	    }

	    @After
	    public void tearDown() {
	        DriverManager.quitDriver();
	        
	    }
	    
	    
}

	/*
	  // ThreadLocal for WebDriver instances
  private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
  
	@Before
	public static void before() throws Throwable {
		 // Get the browser type from configReader
		String browser = ConfigReader.getBrowserType();
		 // Initialize driverFactory
		 driverFactory driverFactory = new driverFactory();
		  // Set the WebDriver instance in ThreadLocal
		 driver.set(driverFactory.initializeDrivers(browser));
		

	}

	 @After
	    public void after() {
		 // Get the WebDriver instance from ThreadLocal
		 WebDriver webDriver = driver.get();
	        if (webDriver != null) {
	        	   // Quit the WebDriver
	            webDriver.quit(); 
	            // Remove the thread-local reference
	            driver.remove();  
	        }
	    }
	 
	// Method to get the WebDriver instance
	    public static WebDriver getDriver() {
	        return driver.get();
	    }
	
	
	    
}
*/