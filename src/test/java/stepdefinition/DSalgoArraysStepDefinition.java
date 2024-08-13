package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsUtilities.ConfigReader;
import dsUtilities.DriverManager;
import dsUtilities.LoggerLoad;
import dsalgoPOM.ArrayPage;
import dsalgoPOM.HomePage;
import dsalgoPOM.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoArraysStepDefinition {

	
	WebDriver driver;
	ConfigReader configReader = new ConfigReader();
	WebDriverWait wait;
	SignInPage signInPage;
	HomePage homepage;
	ArrayPage arraypage;

	public DSalgoArraysStepDefinition() {

		driver = DriverManager.getDriver();
		signInPage = new SignInPage(driver);
		homepage = new HomePage(driver);
		arraypage = new ArrayPage(driver);

	}

	// Scenario: Verify if user able to direct to "Graph" Page

	@Given("The user is in the Array page after logged in")
	public void the_user_is_in_the_array_page_after_logged_in() {

		homepage.selectArray();

	}

	@When("The user clicks Arrays in Python link in Topics covered section")
	public void the_user_clicks_Arrays_in_Python_link_in_topics_covered_section() {

		arraypage.verifyArraysInPythonPage();
	}

	@Then("The user should be directed to Arrays in Python Page")
	public void the_user_should_be_directed_to_Arrays_in_Python_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Arrays in Python']")).getText(); 
		Assert.assertEquals(actual, "Arrays in Python"); 
		LoggerLoad.info("user redirected to Arrays in Python page");
	}

	// Scenario: Verify if user able to redirect to a page having an tryEditor with
	// a Run button to test
	@Given("The user is in the Arrays in Python page")
	public void the_user_is_in_the_Arrays_in_Python_page() {
		homepage.selectArray();
		arraypage.verifyArraysInPythonPage();

	}

	@When("The user clicks Try Here button in the Array page")
	public void the_user_clicks_try_here_button_in_the_array_page() {
		arraypage.tryhereButton();

	}

	@Then("The user should be redirected to a array page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_array_page_having_an_try_editor_with_a_run_button_to_test() {

		System.out.println(driver.getTitle());

	}

//  Scenario: Verify if user able to see the output in console 
	@Given("The user is on the Array tryEditor page")
	public void the_user_is_on_the_array_tryeditor_page() {
		homepage.selectArray();
		arraypage.verifyArraysInPythonPage();
		arraypage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	@When("The User writes Valid python code in array page")
	public void the_user_writes_valid_python_code_in_array_page() {

		arraypage.tryhere("print\"hello\"");

	}

	@When("Click the Run button in array page")
	public void click_the_run_button_in_array_page() {
		arraypage.runButton();
	}

	@Then("User is able to see the output in console of array page")
	public void user_is_able_to_see_the_output_in_console_of_array_page() {
		arraypage.outputconsole();
		LoggerLoad.info("user validated valid code in array page");

	}
	
//  Scenario: Verify if user able to see the error msg in pop up window 
	//Failed with print -invalid code
	
	
	@When("The user writes invalid python code in array page")
	public void the_user_writes_invalid_python_code_in_array_page() {
		arraypage.tryhere("printf");
	}
	
	@Then("User is able to see the error msg in array page pop up window")
	public void user_is_able_to_see_the_error_msg_in_array_page_pop_up_window()  {
		
		arraypage.outputt();
		LoggerLoad.info("user validated invalid code in array page");
  	
	}

	@When("The user clicks Arrays Using List link in Topics covered section")
	public void the_user_clicks_arrays_using_list_link_in_topics_covered_section() {

		arraypage.verifyArraysUsingListPage();
	}
	
	@Then("The user should be directed to Arrays Using List Page")
	public void the_user_should_be_directed_to_arrays_using_list_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Arrays Using List']")).getText();
		Assert.assertEquals(actual, "Arrays Using List"); 
		LoggerLoad.info("user redirected to Arrays Using List page");
	}


	
	
	
//  Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
	
	@Given("The user is in the Arrays Using List page")
	public void the_user_is_in_the_arrays_using_list_page() {
		   homepage.selectArray();
		   arraypage.verifyArraysUsingListPage();

	}
	

	
	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Arrays Using List tryEditor page")
	public void the_user_is_on_the_arrays_using_list_tryeditor_page() {
			homepage.selectArray();
			arraypage.verifyArraysUsingListPage();
			arraypage.tryhereButton();
			System.out.println(driver.getTitle());

		}
	
	
	
	@When("The user clicks Basic Operations in Lists link in Topics covered section")
	public void the_user_clicks_basic_operations_in_lists_link_in_topics_covered_section() {

		arraypage.verifyBasicOperationsInListsPage();
	}
	
	@Then("The user should be directed to Basic Operations in Lists Page")
	public void the_user_should_be_directed_to_basic_operations_in_lists_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Basic Operations in Lists']")).getText();
		Assert.assertEquals(actual, "Basic Operations in Lists"); 
		LoggerLoad.info("user redirected to Basic Operations in Lists page");
	}


	
	
	
//  Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
	
	@Given("The user is in the Basic Operations in Lists page")
	public void the_user_is_in_the_basic_operations_in_lists_page() {
		   homepage.selectArray();
		   arraypage.verifyBasicOperationsInListsPage();

	}
	

	
	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Basic Operations in Lists tryEditor page")
	public void the_user_is_on_the_basic_operations_in_lists_tryeditor_page() {
			homepage.selectArray();
			arraypage.verifyBasicOperationsInListsPage();
			arraypage.tryhereButton();
			System.out.println(driver.getTitle());

		}
	
	
	//
	@When("The user clicks Applications of Array link in Topics covered section")
	public void the_user_clicks_applications_of_array_link_in_topics_covered_section() {

		arraypage.verifyApplicationsOfArrayPage();
	}
	
	@Then("The user should be directed to Applications of Array Page")
	public void the_user_should_be_directed_to_applications_of_array_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Applications of Array']")).getText();
		Assert.assertEquals(actual, "Applications of Array"); 
		LoggerLoad.info("user redirected to Applications of Array page");
	}


	
	
	
//  Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
	
	@Given("The user is in the Applications of Array page")
	public void the_user_is_in_the_applications_of_array_page() {
		   homepage.selectArray();
		   arraypage.verifyApplicationsOfArrayPage();

	}
	

	
	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Applications of Array tryEditor page")
	public void the_user_is_on_the_applications_of_array_tryeditor_page() {
			homepage.selectArray();
			arraypage.verifyApplicationsOfArrayPage();
			arraypage.tryhereButton();
			System.out.println(driver.getTitle());

		}
}