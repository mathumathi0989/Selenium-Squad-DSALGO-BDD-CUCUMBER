package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue= {"stepdefinition"},
plugin={"pretty",
		  "html:target/cucumber-reports/dsalgo.html",
          "json:target/cucumber-reports/cucumber.json",
          "junit:target/cucumber-reports/cucumber.xml",
          "timeline:test-output-thread/"}

		)
public class TestRunner {

	

	
	
}
