package dsUtilities;

public class ConfigReader {

	  // Store the browser type
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

		
		
}
