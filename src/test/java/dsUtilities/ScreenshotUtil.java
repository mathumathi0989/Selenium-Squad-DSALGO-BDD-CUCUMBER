package dsUtilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;
import dsUtilities.DriverManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScreenshotUtil {
	
//	public static void takeScreenshot(Scenario scenario) {
//        WebDriver driver = DriverManager.getDriver(new ConfigReader().getProperty("browser"));
//        
//        if (scenario.isFailed()) {
//            TakesScreenshot screenshot = (TakesScreenshot) driver;
//            File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
//            try {
//                // Save the screenshot to a specific location
//                Files.copy(screenshotFile.toPath(), Paths.get("target/screenshots", scenario.getName() + ".png"));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        }
}