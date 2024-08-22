package dsUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	
	public static void initializeDriver(String browser) {
		if (driver.get() == null) { 
			try {
				ConfigReader.setBrowser(browser);
				if (browser.equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver.set(new ChromeDriver());
				} else if (browser.equalsIgnoreCase("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver.set(new FirefoxDriver());
				} else {
					throw new IllegalArgumentException("Browser not supported: " + browser);
				}
				driver.get().manage().window().maximize();
				System.out.println("Initialized WebDriver for browser: " + browser);
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("Failed to initialize WebDriver", e);
			}
		}
	}

	
	public static WebDriver getDriver() {
		if (driver.get() == null) {
			throw new IllegalStateException("WebDriver is not initialized. Please call initializeDriver() first.");
		}
		return driver.get();
	}

	
	public static void quitDriver() {
		if (driver.get() != null) {
			driver.get().quit();
			driver.remove();
			System.out.println("WebDriver quit and removed");
		}
	}

}