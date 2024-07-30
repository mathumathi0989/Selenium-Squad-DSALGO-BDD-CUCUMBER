package testrunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin= {"pretty", "html:target/cucumber-reports/dsalgo.html"},tags="@sanity",
features={"src/test/resources/features/Graph.feature"},glue= "stepdefinition")

public class TestRunner extends AbstractTestNGCucumberTests {

	

	
	
}
