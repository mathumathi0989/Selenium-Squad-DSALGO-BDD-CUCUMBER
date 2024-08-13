package stepdefinition;
/*
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsUtilities.ConfigReader;
import dsUtilities.DriverManager;
import dsUtilities.LoggerLoad;
import dsalgoPOM.HomePage;
import dsalgoPOM.SignInPage;
import dsalgoPOM.StackPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoStackStepDefinition {

	WebDriver driver;
	ConfigReader configReader = new ConfigReader();
	WebDriverWait wait;
	SignInPage signInPage;
	HomePage homepage;
	StackPage stackpage;

	public DSalgoStackStepDefinition() {

		driver = DriverManager.getDriver();
		signInPage = new SignInPage(driver);
		homepage = new HomePage(driver);
		stackpage = new StackPage(driver);

	}

	// Scenario: Verify if user able to direct to "Operations in Stack" Page

	@Given("The user is in the Stack page after logged in")
	public void the_user_is_in_the_stack_page_after_logged_in() {

		homepage.selectStack();

	}

	@When("The user clicks Operations in Stack button")
	public void the_user_clicks_operations_in_stack_button() {

		stackpage.verifyOperationsinStackPage();
	}

	@Then("The user should be directed to Operations in Stack Page")
	public void the_user_should_be_directed_to_operations_in_stack_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Operations in Stack']")).getText();
		Assert.assertEquals(actual, "Operations in Stack");
		LoggerLoad.info("user redirected to Operations in Stack Page");	   

	}

	// Scenario: Verify if user able to redirect to a page having an tryEditor with
	// a Run button to test
	@Given("The user is in the Operations in Stack page")
	public void the_user_is_in_the_operations_in_stack_page() {
		homepage.selectStack();
		stackpage.verifyOperationsinStackPage();

	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		stackpage.tryhereButton();

	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {

		System.out.println(driver.getTitle());

	}

//  Scenario: Verify if user able to see the output in console 
	@Given("The user is on the Operations in stack tryEditor page")
	public void the_user_is_on_the_operations_in_stack_try_editor_page() {
		homepage.selectStack();
		stackpage.verifyOperationsinStackPage();
		stackpage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	@When("The User writes Valid python code")
	public void the_user_writes_valid_python_code() {

		stackpage.tryhere("print\"hello\"");

	}

	@When("Click the Run button")
	public void click_the_run_button() {
		stackpage.runButton();
	}

	@Then("User is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
		stackpage.outputconsole();
		LoggerLoad.info("user validated valid code in stack page");

	}
	
//  Scenario: Verify if user able to see the error msg in pop up window 
	//Failed with print -invalid code
	
	@When("The user writes invalid python code")
	public void the_user_writes_invalid_python_code() {
		stackpage.tryhere("printf");
		

	}
	@Then("User is able to see the error msg in pop up window")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window()  {
		
	    stackpage.output();
		LoggerLoad.info("user validated invalid code in stack page");

  	
	}
	
  //  Scenario: Verify if user able to direct to "Implementation" Page

	@When("The user clicks Implementation button")
	public void the_user_clicks_implementation_button() {
	   stackpage.verifyImplementaionPage();
		
	}
	@Then("The user should be directed to Implementation Page")
	public void the_user_should_be_directed_to_implementation_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Implementation']")).getText();
		Assert.assertEquals(actual, "Implementation"); 
		LoggerLoad.info("user is directed to Implementation Page");

	}
	
	
//  Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
	
	@Given("The user is in the Implementation page")
	public void the_user_is_in_the_implementation_page() {
		   homepage.selectStack();
		   stackpage.verifyImplementaionPage();

	}
	

	
	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Implementation tryEditor page")
	public void the_user_is_on_the_implementation_try_editor_page() {
			homepage.selectStack();
			stackpage.verifyImplementaionPage();
			stackpage.tryhereButton();
			System.out.println(driver.getTitle());

		}
		


	//   Scenario: Verify if user able to see the error msg in pop up window
		
	
	//   Scenario: Verify if user able to direct to "Applications" Page
		
		@When("The user clicks Application button")
		public void the_user_clicks_application_button() {
		 
		stackpage.verifyApplicationPage();	
			
		}
		@Then("The user should be directed to Applications Page")
		public void the_user_should_be_directed_to_applications_page() {
			System.out.println(driver.getTitle());
			String actual = driver.findElement(By.xpath("//p[text()='Applications']")).getText();
			Assert.assertEquals(actual, "Applications");
			LoggerLoad.info("user is directed to Applications Stackpage");

		}
		
	//   Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
		
		@Given("The user is in the Applications page")
		public void the_user_is_in_the_applications_page() {
			homepage.selectStack();
			stackpage.verifyApplicationPage();
			
		}
		
		
		
		
		//    Scenario: Verify if user able to see the output in console
		//same repetitive steps
		@Given("The user is on the Applications tryEditor page")
		public void the_user_is_on_the_applications_try_editor_page() {
			homepage.selectStack();
			stackpage.verifyApplicationPage();
			stackpage.tryhereButton();
			System.out.println(driver.getTitle());

		}
		
		//    Scenario: Verify if user to see the error msg in pop up window
        //repeat steps
		
	 
		



		
	}

	*/
	
	
	
