package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsUtilities.ConfigReader;
import dsUtilities.DriverManager;
import dsUtilities.LoggerLoad;
import dsalgoPOM.HomePage;
import dsalgoPOM.SignInPage;
import dsalgoPOM.GraphPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoGraphStepDefinition {

	WebDriver driver;
	ConfigReader configReader = new ConfigReader();
	WebDriverWait wait;
	SignInPage signInPage;
	HomePage homepage;
	GraphPage graphpage;

	public DSalgoGraphStepDefinition() {

		driver = DriverManager.getDriver();
		signInPage = new SignInPage(driver);
		homepage = new HomePage(driver);
		graphpage = new GraphPage(driver);

	}
	// Scenario: Verify if user able to direct to "Graph" Page

	@Given("The user is in the Graph page after logged in")
	public void the_user_is_in_the_graph_page_after_logged_in() {

		homepage.selectGraph();

	}

	@When("The user clicks Graph link in Topics covered section")
	public void the_user_clicks_graph_link_in_topics_covered_section() {

		graphpage.verifyGraphPage();
	}

	@Then("The user should be directed to Graph Page")
	public void the_user_should_be_directed_to_graph_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Graph']")).getText();
		Assert.assertEquals(actual, "Graph");
		LoggerLoad.info("user redirected to Graph page");
	}

	// Scenario: Verify if user able to redirect to a page having an tryEditor with
	// a Run button to test
	@Given("The user is in the Graph page")
	public void the_user_is_in_the_graph_page() {
		homepage.selectGraph();
		graphpage.verifyGraphPage();

	}

	@When("The user clicks Try Here button in the graph page")
	public void the_user_clicks_try_here_button_in_the_graph_page() {
		graphpage.tryhereButton();

	}

	@Then("The user should be redirected to a graph page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_graph_page_having_an_try_editor_with_a_run_button_to_test() {

		Assert.assertEquals(driver.getTitle(), "Assessment");
		LoggerLoad.info("User is in tryEditor page");

	}

//  Scenario: Verify if user able to see the output in console 
	@Given("The user is on the Graph tryEditor page")
	public void the_user_is_on_the_graph_tryeditor_page() {
		homepage.selectGraph();
		graphpage.verifyGraphPage();
		graphpage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	@When("The User writes Valid python code in graph page")
	public void the_user_writes_valid_python_code_in_graph_page() {

		graphpage.tryhere("print\"hello\"");

	}

	@When("Click the Run button in graph page")
	public void click_the_run_button_in_graph_page() {
		graphpage.runButton();
	}

	@Then("User is able to see the output in console of graph page")
	public void user_is_able_to_see_the_output_in_console_of_graph_page() {

		Assert.assertEquals(graphpage.outputconsole(), "hello");
		LoggerLoad.info("user validated valid code in graph page");

	}

//  Scenario: Verify if user able to see the error msg in pop up window 
	// Failed with print -invalid code

	@When("The user writes invalid python code in graph page")
	public void the_user_writes_invalid_python_code_in_graph_page() {
		graphpage.tryhere("printf");

	}

	@Then("User is able to see the error msg in graph page pop up window")
	public void user_is_able_to_see_the_error_msg_in_graph_page_pop_up_window() {

		graphpage.outputt();
		Assert.assertNotNull(graphpage.alert, "Alert is not present.");
		LoggerLoad.info("user validated invalid code in graph page");

	}

	@When("The user clicks Graph representations link in Topics covered section")
	public void the_user_clicks_graph_representations_link_in_topics_covered_section() {

		graphpage.verifyGraphRepresentationsPage();
	}

	@Then("The user should be directed to Graph representations Page")
	public void the_user_should_be_directed_to_graph_representations_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Graph Representations']")).getText();
		Assert.assertEquals(actual, "Graph Representations");
		LoggerLoad.info("user redirected to graph representation page");
	}

//  Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test

	@Given("The user is in the Graph representations page")
	public void the_user_is_in_the_graph_representations_page() {
		homepage.selectGraph();
		graphpage.verifyGraphRepresentationsPage();

	}

	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Graph representations tryEditor page")
	public void the_user_is_on_the_graph_representations_tryeditor_page() {
		homepage.selectGraph();
		graphpage.verifyGraphRepresentationsPage();
		graphpage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	// Scenario: Verify if user able to view practice page

	@When("The user clicks Graph Practice Questions link")
	public void the_user_clicks_graph_practice_questions_link() {

		graphpage.verifyPracticePage();

	}

	@Then("The user is redirected to Graph Practice Questions page")
	public void the_user_is_redirected_to_graph_practice_questions_page() {

		Assert.assertEquals(driver.getTitle(), "Practice Questions");
		LoggerLoad.info("user redirected to Practice page");

	}
}
