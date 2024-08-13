package stepdefinition;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsUtilities.ConfigReader;
import dsUtilities.DriverManager;
import dsUtilities.LoggerLoad;
import dsalgoPOM.HomePage;
import dsalgoPOM.QueuePage;
import dsalgoPOM.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoQueueStepDefinition {
	WebDriver driver;
	ConfigReader configReader = new ConfigReader();
	WebDriverWait wait;
	SignInPage signInPage;
	HomePage homepage;
	QueuePage queuepage;

	public DSalgoQueueStepDefinition() {

		driver = DriverManager.getDriver();
		signInPage = new SignInPage(driver);
		homepage = new HomePage(driver);
		 queuepage=new QueuePage(driver);
	}
	
	// Scenario: Verify if user able to direct "Implementation of Queue in Python" page
	
	@Given("The  user is on the Queue page after logged in")
	public void the_user_is_on_the_queue_page_after_logged_in() {
	    
		homepage.selectQueue();
	}
	@When("The user clicks  Implementation of Queue in Python link")
	public void the_user_clicks_implementation_of_queue_in_python_link() {
	    queuepage.verifyImplementationofQueue();
	}
	@Then("The user should be redirected to Implementation of Queue in Python Page")
	public void the_user_should_be_redirected_to_implementation_of_queue_in_python_page() {
    	System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Implementation of Queue in Python']")).getText();
		Assert.assertEquals(actual, "Implementation of Queue in Python");
		LoggerLoad.info("user redirected to Implementation of Queue in Python Page");	   
	}

	
	
	
// Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
	@Given("The user is in the Implementation of Queue Page")
	public void the_user_is_in_the_implementation_of_queue_page() {
	    
		homepage.selectQueue();
		queuepage.verifyImplementationofQueue();
	}
	@When("The user clicks Try Here button in Queue Page")
	public void the_user_clicks_try_here_button_in_queue_page() {
		queuepage.tryhereButton();
	   
	}
	@Then("The user should be redirected to a Queue page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_queue_page_having_an_try_editor_with_a_run_button_to_test() {
		System.out.println(driver.getTitle());

	}


// Scenario: Verify if user able to see the output in console
	
	@Given("The user is on the Queue tryEditor page")
	public void the_user_is_on_the_queue_try_editor_page() {
		homepage.selectQueue();
		queuepage.verifyImplementationofQueue();
		queuepage.tryhereButton();
		System.out.println(driver.getTitle());

	}
	@When("The User writes valid python code in Queue Page")
	public void the_user_writes_valid_python_code_in_queue_page() {
	    queuepage.tryhere("print\"hello\"");
		
	}
	@When("Click the Run button in Queue Page")
	public void click_the_run_button_in_queue_page() {
	  queuepage.runButton();
	}
	@Then("User is able to see the output in console of Queue Page")
	public void user_is_able_to_see_the_output_in_console_of_queue_page() {
	   queuepage.outputconsole();
		LoggerLoad.info("user validated valid code in Queue page");

		
	}
// Scenario: Verify if user able to see the error msg in pop up window

	
	@When("The user writes invalid python code in Queue Page")
	public void the_user_writes_invalid_python_code_in_queue_page() {
	   queuepage.tryhere("hello");
	}

	@Then("User is able to see the error msg in  Queue Page pop up window")
	public void user_is_able_to_see_the_error_msg_in_queue_page_pop_up_window() {
	   queuepage.output();
		LoggerLoad.info("user validated invalid code in Queue page");

	}
	
// Scenario: Verify if user able to direct to "Implementation using collections.deque"

	@When("The user clicks  Implementation using collections.deque link")
	public void the_user_clicks_implementation_using_collections_deque_link() {
	    
		queuepage.verifyImplementationCollections();
	}
	@Then("The user should be redirected to Implementation using collections.deque Page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Implementation using collections.deque']")).getText();
		Assert.assertEquals(actual, "Implementation using collections.deque");
		LoggerLoad.info("user redirected to Implementation using collections.deque Page");	
	}
	
	// Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
	
	@Given("The user is on the Implementation using collections.deque Page")
	public void the_user_is_on_the_implementation_using_collections_deque_page() {
	    homepage.selectQueue();
		queuepage.verifyImplementationCollections();

	}
	
	
	//  Scenario: Verify if user able to direct to "Implementation using array"


	@When("The user clicks Implementation using array link")
	public void the_user_clicks_implementation_using_array_link() {
	    
		queuepage.verifyImplementationArray();
	}
	@Then("The user should be redirected to Implementation using array Page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Implementation using array']")).getText();
		Assert.assertEquals(actual, "Implementation using array");
		LoggerLoad.info("user redirected to Implementation using array Page");	
	}
	
// Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test

	
	@Given("The user is on the Implementation using array Page")
	public void the_user_is_on_the_implementation_using_array_page() {
	    homepage.selectQueue();
		queuepage.verifyImplementationArray();

	}
	
	

	// Scenario: Verify if user able to direct to "Queue Operations"

	
	@When("The user clicks Queue Operations link")
	public void the_user_clicks_queue_operations_link() {
	   queuepage.verifyOperationsQueue();
	}
	@Then("The user should be redirected to Queue Operations Page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Queue Operations']")).getText();
		Assert.assertEquals(actual, "Queue Operations");
		LoggerLoad.info("user redirected to Queue Operations Page");
	    
	}
	
	
	// Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test

	@Given("The user is on the Queue Operations Page")
	public void the_user_is_on_the_queue_operations_page() {
	    homepage.selectQueue(); 
		queuepage.verifyOperationsQueue();

	}
	
	
	

}*/