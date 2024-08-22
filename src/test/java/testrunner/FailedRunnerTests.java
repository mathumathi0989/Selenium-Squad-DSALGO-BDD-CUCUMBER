package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"@target/failedrerun.txt"}, glue = {"stepdefinition","hooks"},
tags = "@sanity", plugin = { "pretty", "html:target/cucumber-reports.html",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" ,"rerun:target/failedrerun.txt"})
public class FailedRunnerTests extends AbstractTestNGCucumberTests{

	
	
}
