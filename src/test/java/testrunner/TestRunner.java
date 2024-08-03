package testrunner;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import dsUtilities.ConfigReader;


@CucumberOptions(
        features = {"src/test/resources/features/DSAlgoSignin.feature"},
        glue = {"stepdefinition","hooks"},
        plugin = {"pretty", "html:target/cucumber-reports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class TestRunner extends AbstractTestNGCucumberTests {

	// Provide data for parallel execution of scenarios
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios(); }
	
	
	 // Define the browser parameter before tests
	@BeforeTest
	@Parameters({ "browser" })
	public void defineBrowser(@Optional("chrome") String browser) throws Throwable {
		// Set the browser type in configReader
	ConfigReader.setBrowserType(browser);
	}
	    
	

	
	
}
