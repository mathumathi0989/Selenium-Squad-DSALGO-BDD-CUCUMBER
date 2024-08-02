package dsUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverFactory {

	public WebDriver driver;
	 // Initialize WebDriver based on the browser type
	@Parameters("browser")
	public WebDriver initializeDrivers(String browser) {

		 if (browser.equalsIgnoreCase("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	        } else if (browser.equalsIgnoreCase("chrome")) {
	            WebDriverManager.chromiumdriver();	 
	            driver = new ChromeDriver();
	        } else if (browser.equalsIgnoreCase("safari")) {
	        	SafariOptions options = new SafariOptions();
	        	options.setCapability("automaticInspection", false);
	        	options.setCapability("automaticProfiling", false);

	        	driver = new SafariDriver(options);
	         //   driver = new SafariDriver();
	        } else if (browser.equalsIgnoreCase("edge")) {
	            WebDriverManager.edgedriver().setup();
	            driver = new EdgeDriver();
	        }
		 // Set page load timeout and maximize window
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	        driver.manage().window().maximize();
	        
	        return driver;

	}
	
}
