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
		System.out.println(driver.getTitle());

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
		datastructurespage.outputconsole();
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
		LoggerLoad.info("user validated invalid code in DataStructures page");

	}

}

/*
 * //Scenario: Verify if user able to access data structure homepage
 * 
 * @Given("The user is on the Home page") public void
 * the_user_is_on_the_home_page() { String pageTitle=driver.getTitle();
 * System.out.println(pageTitle); }
 * 
 * @When("The user clicks on DataStructure Get Started button") public void
 * the_user_clicks_on_data_structure_get_started_button() {
 * driver.findElement(By.xpath("//a[@href='data-structures-introduction']")).
 * click(); }
 * 
 * @Then("The user should be redirected to the data structure homepage") public
 * void the_user_should_be_redirected_to_the_data_structure_homepage() {
 * 
 * String actualdDsTitle=driver.getTitle(); String
 * expectedDsTitle="Data Structures-Introduction";
 * Assert.assertEquals(actualdDsTitle, expectedDsTitle,
 * "Values are not equal!");
 * LoggerLoad.info("Data Structure home page displayed successfully"); }
 * 
 * //Scenario: Verify if user able to access topics covered section
 * 
 * 
 * @Given("The  user is on the data structure homepage") public void
 * the_user_is_on_the_data_structure_homepage() {
 * driver.findElement(By.xpath("//a[@href='data-structures-introduction']")).
 * click(); // String dsPageTitle=driver.getTitle(); //
 * System.out.println(dsPageTitle);
 * 
 * }
 * 
 * @When("The user clicks on Topics covered") public void
 * the_user_clicks_on_topics_covered() {
 * driver.findElement(By.xpath("//a[@href='time-complexity']")).click(); }
 * 
 * @Then("The user should be redirected to selected topic covered page") public
 * void the_user_should_be_redirected_to_selected_topic_covered_page() { String
 * actualTcTitle=driver.getTitle(); String expectedTcTitle="Time Complexity";
 * Assert.assertEquals(actualTcTitle, expectedTcTitle, "Values are not equal!");
 * LoggerLoad.info("User redirected to DS - Topic covered successfully");
 * 
 * }
 * 
 * //Scenario: Verify if user able to view the python editor page from topics
 * covered section
 * 
 * @Given("The user is on the selected topic covered page") public void
 * the_user_is_on_the_selected_topic_covered_page() {
 * //driver.findElement(By.xpath("//a[@href='data-structures-introduction']")).
 * click(); String dsPageTitle=driver.getTitle();
 * System.out.println(dsPageTitle);
 * 
 * }
 * 
 * @When("The user clicks Try Here button") public void
 * the_user_clicks_try_here_button() {
 * driver.findElement(By.xpath("//a[text()='Try here>>>']")).click(); }
 * 
 * @Then("The user should be redirected to a page having an Python Editor")
 * public void the_user_should_be_redirected_to_a_page_having_an_python_editor()
 * { String actualTitle=driver.getTitle(); String expectedTitle="Assessment";
 * Assert.assertEquals(actualTitle, expectedTitle, "Values are not equal!"); }
 * 
 * 
 * //Scenario: Verify if user able to validate the python editor with empty data
 * 
 * @When("Click the Run button") public void click_the_run_button() {
 * driver.findElement(By.xpath("//button[text()='Run]")).click(); }
 * 
 * //Scenario: Verify if user able to validate the python editor with invalid
 * data
 * 
 * 
 * 
 * 
 * 
 * //Scenario: Verify if user able to validate the python editor with valid data
 * 
 * @Given("The user is on the Python Editor") public void
 * the_user_is_on_the_python_editor() { String dsPageTitle=driver.getTitle();
 * System.out.println(dsPageTitle);
 * 
 * }
 * 
 * @When("The user enter {string} code in Editor") public void
 * the_user_enter_code_in_editor(String codeValue) { String script =
 * "var editor = document.querySelector('.CodeMirror').CodeMirror;" +
 * "editor.setValue(arguments[0]);"; JavascriptExecutor js =
 * (JavascriptExecutor) driver;
 * 
 * if(codeValue.equalsIgnoreCase("empty")) {
 * 
 * code=""; } else if(codeValue.equalsIgnoreCase("valid")) {
 * code="print\"hello\""; } else{ code="Anusuya"; }
 * js.executeScript(script,code); }
 * 
 * @Then("The user is validated with expected result") public void
 * the_user_is_validated_with_expected_result() {
 * 
 * WebElement output=driver.findElement(By.xpath("//pre[@id='output']")); try {
 * Alert alert = wait.until(ExpectedConditions.alertIsPresent());
 * System.out.println("Alert message: " + alert.getText()); alert.accept(); }
 * catch (Exception e) { try {
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
 * "//pre[@id='output']"))); String codeOutput = output.getText();
 * System.out.println("Code output: " + codeOutput); } catch (Exception ex) {
 * System.out.println("No output element found or no output generated."); } } }
 * 
 * 
 * 
 * //Scenario: Verify if user able to view practice page
 * 
 * @Given("The  user is on the Time Complexity page") public void
 * the_user_is_on_the_time_complexity_page() { String
 * dsPageTitle=driver.getTitle(); System.out.println(dsPageTitle); }
 * 
 * @When("The user clicks Practice Questions link") public void
 * the_user_clicks_practice_questions_link() {
 * driver.findElement(By.xpath("//a[text()='Practice Questions']")).click(); }
 * 
 * @Then("The user should be redirected to Practice page") public void
 * the_user_should_be_redirected_to_practice_page() { String
 * actualdDsTitle=driver.getTitle(); String
 * expectedDsTitle="Practice Questions"; Assert.assertEquals(actualdDsTitle,
 * expectedDsTitle, "Values are not equal!"); }
 * 
 */
