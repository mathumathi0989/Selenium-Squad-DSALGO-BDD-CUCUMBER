package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/*
public class DSalgoStackStepDefinition {

	 // Scenario: Verify if user able to direct to "Operations in Stack" Page
	
	@Given("The user is in the Stack page after logged in")
	public void the_user_is_in_the_stack_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String stack) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	//Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
	@Given("The user is in the Operations in Stack page")
	public void the_user_is_in_the_operations_in_stack_page() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}

	
	
//  Scenario: Verify if user able to see the output in console 
	@Given("The user is on the tryEditor page")
	public void the_user_is_on_the_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The User writes Valid python code")
	public void the_user_writes_valid_python_code() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Click the Run button")
	public void click_the_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    
	}
	
	//  Scenario: Verify if user able to see the error msg in pop up window
	
	@Given("The user is on the tryEditor page")
	public void the_user_is_on_the_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The user writes invalid python code")
	public void the_user_writes_invalid_python_code() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Click the Run button")
	public void click_the_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User is able to see the error msg in pop up window")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	//  Scenario: Verify if user is on the same page having Editor and Run button

	
	@Given("The user is on the editor page withAlert  error message")
	public void the_user_is_on_the_editor_page_with_alert_error_message() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("The user click the ok button in the alert window")
	public void the_user_click_the_ok_button_in_the_alert_window() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@Then("The user is on the same page having Editor and Run button")
	public void the_user_is_on_the_same_page_having_editor_and_run_button() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}


	
	//  Scenario: Verify if user able to direct to "Implementation" Page
	@Given("The user is in the Stack page after logged in")
	public void the_user_is_in_the_stack_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks {string} button")
	public void the_user_clicks_button(String implement) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String imple) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	//   Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test 

	
	@Given("The user is in the Implementation page")
	public void the_user_is_in_the_implementation_page() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}

	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the tryEditor page")
	public void the_user_is_on_the_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The User writes Valid python code")
	public void the_user_writes_valid_python_code() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("click Run button")
	public void click_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	//   Scenario: Verify if user able to see the error msg in pop up window 
	@Given("The user is on the tryEditor page")
	public void the_user_is_on_the_try_editor_page() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("the user writes invalid python code")
	public void the_user_writes_invalid_python_code() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("click Run button")
	public void click_run_button() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@Then("User is able to see the error msg in pop up window")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	
	//   Scenario: Verify if user is on the same page having Editor and Run button  
	@Given("The user is on the editor page with Alert  error message")
	public void the_user_is_on_the_editor_page_with_alert_error_message() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("The user click the ok button in the alert window")
	public void the_user_click_the_ok_button_in_the_alert_window() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@Then("The user is on the same page having Editor and Run button")
	public void the_user_is_on_the_same_page_having_editor_and_run_button() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
		
//   Scenario: Verify if user able to direct to "Applications" Page
	@Given("The user is in the Stack page after logged in")
	public void the_user_is_in_the_stack_page_after_logged_in() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}

	
    //Scenario: Verify if user able to redirect to a page having an tryEditor with a Run button to test
	
	@Given("The user is in the Applications page")
	public void the_user_is_in_the_applications_page() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}

	
	//    Scenario: Verify if user able to see the output in console
	@Given("The user is on the tryEditor page")
	public void the_user_is_on_the_try_editor_page() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("The User writes Valid python code")
	public void the_user_writes_valid_python_code() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("click Run button")
	public void click_run_button() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@Then("User is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}

	
	//    Scenario: Verify if user to see the error msg in pop up window 
	
	@Given("The user is on the tryEditor page")
	public void the_user_is_on_the_try_editor_page() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("The user writes invalid python code")
	public void the_user_writes_invalid_python_code() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("Click the Run button")
	public void click_the_run_button() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@Then("User is able to see the error msg in pop up window")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
		

	
	//    Scenario: Verify if user is on the same page having Editor and Run button
	@Given("The user is on the editor page with Alert  error message")
	public void the_user_is_on_the_editor_page_with_alert_error_message() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("The user click the ok button in the alert window")
	public void the_user_click_the_ok_button_in_the_alert_window() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@Then("The user is on the same page having Editor and Run button")
	public void the_user_is_on_the_same_page_having_editor_and_run_button() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
		

	
	//    Scenario: Verify if user able to redirect to "Practice" page 
	@Given("The user is in the Stack page after logged in")
	public void the_user_is_in_the_stack_page_after_logged_in() {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
	   // Write code here that turns the phrase above into concrete actions
	   throw new io.cucumber.java.PendingException();
	}
	}

*/

	
	

	
	
	
