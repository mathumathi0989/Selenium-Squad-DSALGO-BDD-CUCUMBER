package dsUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ConfigReader {
	
	 private Properties properties;

	    public ConfigReader() {
	        properties = new Properties();
	        try {
	            FileInputStream inputStream = new FileInputStream("src/test/resources/config.properties");
	            properties.load(inputStream);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public String getProperty(String key) {
	        return properties.getProperty(key);
	    }
	}
	/*  // Store the browser type
		private static String browserType = null;

		 // Set the browser type
		public static void setBrowserType(String browser) {

			browserType = browser;

		}
		 // Get the browser type
		public static String getBrowserType() throws Throwable {

			if (browserType != null)

				return browserType;

			else

				throw new RuntimeException("browser not specified in the testng.xml");

		}

	*/
		
		
		
		
		

