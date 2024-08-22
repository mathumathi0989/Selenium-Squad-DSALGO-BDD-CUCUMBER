package hooks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Parameters;

import dsUtilities.ConfigReader;
import dsUtilities.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {

	@Before
	public void setUp(Scenario scenario) {
		String browser = ConfigReader.getBrowser();
		if (browser == null) {
			browser = "chrome"; 
		}
		DriverManager.initializeDriver(browser);
	}

	@After
	public void tearDown(Scenario scenario) {
		takeScreenshot(scenario);
		DriverManager.quitDriver();
	}

	// Take a screenshot if the scenario fails
	public static void takeScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
				String screenshotFileName = scenario.getName().replaceAll(" ", "_") + "_" + timestamp + ".png";
				File screenshotFile = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
				Files.copy(screenshotFile.toPath(), Paths.get("target/screenshots", screenshotFileName));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}