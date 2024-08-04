package dsUtilities;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static WebDriver driver;

  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	
    public static  WebDriver getDriver(String browser) {
        if (driver == null) {
            switch (browser.toLowerCase()) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome":
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;       
            }
        }
     // Set page load timeout and maximize window
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}


	
	/*

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
*/