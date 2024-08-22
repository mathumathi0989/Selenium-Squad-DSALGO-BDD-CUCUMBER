package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsUtilities.ConfigReader;
import dsUtilities.DriverManager;
import dsUtilities.LoggerLoad;
import dsalgoPOM.LinkListPage;
import dsalgoPOM.HomePage;
import dsalgoPOM.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoLinkedListStepDefinition {

	WebDriver driver;
	ConfigReader configReader = new ConfigReader();
	WebDriverWait wait;
	SignInPage signInPage;
	HomePage homepage;
	LinkListPage linkedlistpage;

	public DSalgoLinkedListStepDefinition() {

		driver = DriverManager.getDriver();
		signInPage = new SignInPage(driver);
		homepage = new HomePage(driver);
		linkedlistpage = new LinkListPage(driver);

	}

	// Scenario: Verify if user able to direct to "Linked List" Page

	@Given("The user is in the Linked List page after logged in")
	public void the_user_is_in_the_linked_list_page_after_logged_in() {

		homepage.selectLinkedList();

	}

	@When("The user clicks Introduction link in Topics covered section")
	public void the_user_clicks_introduction_link_in_topics_covered_section() {

		linkedlistpage.verifyIntroductionPage();
	}

	@Then("The user should be directed to Introduction Page")
	public void the_user_should_be_directed_to_introduction_page() {

		// System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Introduction']")).getText();
		Assert.assertEquals(actual, "Introduction");
		LoggerLoad.info("user redirected to Introduction page");
	}

	// Scenario: Verify if user able to redirect to a page having an tryEditor with
	// a Run button to test
	@Given("The user is in the Introduction page")
	public void the_user_is_in_the_introduction_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyIntroductionPage();

	}

	@When("The user clicks Try Here button in the Linked List page")
	public void the_user_clicks_try_here_button_in_the_linked_list_page() {
		linkedlistpage.tryhereButton();

	}

	@Then("The user should be redirected to a Linked List page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_linked_list_page_having_an_try_editor_with_a_run_button_to_test() {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Assessment");
		LoggerLoad.info("User is in tryEditor page");
	}

//  Scenario: Verify if user able to see the output in console 
	@Given("The user is on the Introduction tryEditor page")
	public void the_user_is_on_the_introduction_tryeditor_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyIntroductionPage();
		linkedlistpage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	@When("The User writes Valid python code in Linked List page")
	public void the_user_writes_valid_python_code_in_linked_list_page() {

		linkedlistpage.tryhere("print\"hello\"");

	}

	@When("Click the Run button in Linked List page")
	public void click_the_run_button_in_linked_list_page() {
		linkedlistpage.runButton();
	}

	@Then("User is able to see the output in console of Linked List page")
	public void user_is_able_to_see_the_output_in_console_of_linked_list_page() {
		linkedlistpage.outputconsole();
		String actualValue = linkedlistpage.outputconsole();
		Assert.assertEquals(actualValue, "hello");
		LoggerLoad.info("user validated valid code");

	}

//  Scenario: Verify if user able to see the error msg in pop up window 
	// Failed with print -invalid code

	@When("The user writes invalid python code in Linked List page")
	public void the_user_writes_invalid_python_code_in_linked_list_page() {
		linkedlistpage.tryhere("printf");

	}

	@Then("User is able to see the error msg in Linked List page pop up window")
	public void user_is_able_to_see_the_error_msg_in_linked_list_page_pop_up_window() {

		linkedlistpage.outputt();
		Assert.assertNotNull(linkedlistpage.alert, "Alert is not present.");
		LoggerLoad.info("user validated invalid code");

	}

	@When("The user clicks Creating Linked LIst link in Topics covered section")
	public void the_user_clicks_creating_linked_list_link_in_topics_covered_section() {

		linkedlistpage.verifyCreatingLinkedListPage();
	}

	@Then("The user should be directed to Creating Linked LIst Page")
	public void the_user_should_be_directed_to_creating_linked_list_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Creating Linked LIst']")).getText();
		Assert.assertEquals(actual, "Creating Linked LIst");
		LoggerLoad.info("user redirected to Creating Linked LIst page");
	}

//  Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test

	@Given("The user is in the Creating Linked LIst page")
	public void the_user_is_in_the_creating_linked_list_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyCreatingLinkedListPage();

	}

	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Creating Linked LIst tryEditor page")
	public void the_user_is_on_the_creating_linked_list_tryeditor_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyCreatingLinkedListPage();
		linkedlistpage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	@When("The user clicks Types of Linked List link in Topics covered section")
	public void the_user_clicks_types_of_linked_list_link_in_topics_covered_section() {

		linkedlistpage.verifyTypesOfLinkedListPage();
	}

	@Then("The user should be directed to Types of Linked List Page")
	public void the_user_should_be_directed_to_types_of_linked_list_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Types of Linked List']")).getText();
		Assert.assertEquals(actual, "Types of Linked List");
		LoggerLoad.info("user redirected to Types of Linked List page");
	}

//  Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test

	@Given("The user is in the Types of Linked List page")
	public void the_user_is_in_the_types_of_linked_list_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyTypesOfLinkedListPage();

	}

	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Types of Linked List tryEditor page")
	public void the_user_is_on_the_types_of_linked_list_tryeditor_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyTypesOfLinkedListPage();
		linkedlistpage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	@When("The user clicks Implement Linked List link in Topics covered section")
	public void the_user_clicks_implement_linked_list_link_in_topics_covered_section() {

		linkedlistpage.verifyImplementLinkedListPage();
	}

	@Then("The user should be directed to Implement Linked List in Python Page")
	public void the_user_should_be_directed_to_implement_linked_list_in_python_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Implement Linked List in Python']")).getText();
		Assert.assertEquals(actual, "Implement Linked List in Python");
		LoggerLoad.info("user redirected to Implement Linked List in Python page");
	}

//  Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test

	@Given("The user is in the Implement Linked List in Python page")
	public void the_user_is_in_the_implement_linked_list_in_python_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyImplementLinkedListPage();

	}

	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Implement Linked List in Python in tryEditor page")
	public void the_user_is_on_the_implement_linked_list_in_python_in_tryeditor_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyImplementLinkedListPage();
		linkedlistpage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	@When("The user clicks Traversal in Topics covered section")
	public void the_user_clicks_traversal_in_topics_covered_section() {

		linkedlistpage.verifyTraversalPage();
	}

	@Then("The user should be directed to Traversal Page")
	public void the_user_should_be_directed_to_traversal_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Traversal']")).getText();
		Assert.assertEquals(actual, "Traversal");
		LoggerLoad.info("user redirected to Traversal page");
	}

//  Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test

	@Given("The user is in the Traversal page")
	public void the_user_is_in_the_traversal_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyTraversalPage();

	}

	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Traversal tryEditor page")
	public void the_user_is_on_the_traversal_tryeditor_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyTraversalPage();
		linkedlistpage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	@When("The user clicks Insertion in Topics covered section")
	public void the_user_clicks_insertion_in_topics_covered_section() {

		linkedlistpage.verifyInsertionPage();
	}

	@Then("The user should be directed to Insertion Page")
	public void the_user_should_be_directed_to_insertion_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Insertion']")).getText();
		Assert.assertEquals(actual, "Insertion");
		LoggerLoad.info("user redirected to Insertion page");
	}

//  Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test

	@Given("The user is in the Insertion page")
	public void the_user_is_in_the_insertion_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyInsertionPage();

	}

	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Insertion tryEditor page")
	public void the_user_is_on_the_insertion_tryeditor_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyInsertionPage();
		linkedlistpage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	@When("The user clicks Deletion in Topics covered section")
	public void the_user_clicks_deletion_in_topics_covered_section() {

		linkedlistpage.verifyDeletionPage();
	}

	@Then("The user should be directed to Deletion Page")
	public void the_user_should_be_directed_to_deletion_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Deletion']")).getText();
		Assert.assertEquals(actual, "Deletion");
		LoggerLoad.info("user redirected to Deletion page");
	}

//  Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test

	@Given("The user is in the Deletion page")
	public void the_user_is_in_the_deletion_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyDeletionPage();

	}

	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Deletion tryEditor page")
	public void the_user_is_on_the_deletion_tryeditor_page() {
		homepage.selectLinkedList();
		linkedlistpage.verifyDeletionPage();
		linkedlistpage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	// Scenario: Verify if user able to view practice page

	@When("The user clicks linked list Practice Questions link")
	public void the_user_clicks_linked_list_practice_questions_link() {

		linkedlistpage.verifyPracticePage();

	}

	@Then("The user is redirected to linked list Practice Questions page")
	public void the_user_is_redirected_to_linked_list_practice_questions_page() {
		// System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Practice Questions");
		LoggerLoad.info("user redirected to linked list Practice page");

	}

}
