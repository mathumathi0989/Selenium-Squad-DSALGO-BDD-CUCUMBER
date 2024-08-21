package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsUtilities.ConfigReader;
import dsUtilities.DriverManager;
import dsUtilities.LoggerLoad;
import dsalgoPOM.DatastructuresPage;
import dsalgoPOM.HomePage;
import dsalgoPOM.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoDataStructuresStepDefinition {

	WebDriver driver;
	ConfigReader configReader = new ConfigReader();
	WebDriverWait wait;
	SignInPage signInPage;
	HomePage homepage;
	DatastructuresPage datastructurespage;

	public DSalgoDataStructuresStepDefinition() {

		driver = DriverManager.getDriver();
		signInPage = new SignInPage(driver);
		homepage = new HomePage(driver);
		datastructurespage = new DatastructuresPage(driver);

	}

	// Scenario: Verify if user able to direct to "Time Complexity" Page

	@Given("The user is in the DataStructure page after logged in")
	public void the_user_is_in_the_data_structure_page_after_logged_in() {

		homepage.selectDataStructure();
	}

	@When("The user clicks Time Complexity link in Topics covered section")
	public void the_user_clicks_time_complexity_link_in_topics_covered_section() {
		datastructurespage.verifyTimeComplexity();
	}

	@Then("The user should be directed to DataStructure Page")
	public void the_user_should_be_directed_to_data_structure_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Time Complexity']")).getText();
		Assert.assertEquals(actual, "Time Complexity");
		LoggerLoad.info("user redirected to Time Complexity Data Structures Page");
	}

// Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() {

		homepage.selectDataStructure();
		datastructurespage.verifyTimeComplexity();
	}

	@When("The user clicks Try Here button in the DataStructure page")
	public void the_user_clicks_try_here_button_in_the_data_structure_page() {
		datastructurespage.tryhereButton();

	}

	@Then("The user should be redirected to a DataStructure page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_data_structure_page_having_an_try_editor_with_a_run_button_to_test() {
		// System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Assessment");
		LoggerLoad.info("User is in tryEditor page");

	}

// Scenario: Verify if user able to see the output in console

	@Given("The user is on the DataStructure tryEditor page")
	public void the_user_is_on_the_data_structure_try_editor_page() {
		homepage.selectDataStructure();
		datastructurespage.verifyTimeComplexity();
		datastructurespage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	@When("The User writes Valid python code in DataStructure page")
	public void the_user_writes_valid_python_code_in_data_structure_page() {
		datastructurespage.tryhere("print\"hello\"");

	}

	@When("Click the Run button in DataStructure page")
	public void click_the_run_button_in_data_structure_page() {
		datastructurespage.runButton();
	}

	@Then("User is able to see the output in console of DataStructure page")
	public void user_is_able_to_see_the_output_in_console_of_data_structure_page() {
		Assert.assertEquals(datastructurespage.outputconsole(), "hello");
		LoggerLoad.info("user validated valid code in Datastructures page");

	}
// Scenario: Verify if user able to see the error msg in pop up window

	@When("The user writes invalid python code in DataStructure page")
	public void the_user_writes_invalid_python_code_in_data_structure_page() {
		datastructurespage.tryhere("hello");
	}

	@Then("User is able to see the error msg in DataStructure page pop up window")
	public void user_is_able_to_see_the_error_msg_in_data_structure_page_pop_up_window() {
		datastructurespage.output();
		Assert.assertNotNull(datastructurespage.alert, "Alert is not present.");
		LoggerLoad.info("user validated invalid code in DataStructures page");

	}

	// Scenario: Verify if user able to view practice page

	@When("The user clicks DataStructurtures Practice Questions link")
	public void the_user_clicks_DataStructurtures_practice_questions_link() {

		datastructurespage.verifyPracticePage();

	}

	@Then("The user is redirected to Practice Questions page")
	public void the_user_is_redirected_to_practice_questions_page() {
		Assert.assertEquals(driver.getTitle(), "Practice Questions");
		LoggerLoad.info("user redirected to Practice page");
	}
}
