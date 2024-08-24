package testrunner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import dsUtilities.ConfigReader;
import dsUtilities.DriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features" }, glue = { "stepdefinition",
		"hooks" }, tags = "@sanity", plugin = { "pretty", "html:target/cucumber-reports.html",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" ,"rerun:target/failedrerun.txt"})

public class TestRunner extends AbstractTestNGCucumberTests {
	@BeforeClass(alwaysRun = true)
	@Parameters("browser")
	public void setup(String browser) {
		System.out.println("Setting up driver for browser: " + browser);
		ConfigReader.setBrowser(browser); // Set the browser in ConfigReader
		DriverManager.initializeDriver(ConfigReader.getBrowser()); // Initialize driver with browser from ConfigReader
	}

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
