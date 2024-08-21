package testrunner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

<<<<<<< HEAD
@CucumberOptions(
        features = {"src/test/resources/features/01_DSAlgoRegister.feature"},
        glue = {"stepdefinition","hooks"},
        plugin = {"pretty", "html:target/cucumber-reports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
=======
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "stepdefinition",
		"hooks" }, tags = "@sanity", plugin = { "pretty", "html:target/cucumber-reports.html",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
>>>>>>> mathumathi
public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}