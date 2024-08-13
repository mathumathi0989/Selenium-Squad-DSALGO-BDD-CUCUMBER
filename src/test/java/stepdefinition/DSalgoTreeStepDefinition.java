package stepdefinition;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import dsUtilities.DriverManager;
import dsUtilities.ConfigReader;
import dsUtilities.LoggerLoad;
import dsalgoPOM.HomePage;
import dsalgoPOM.SignInPage;
import dsalgoPOM.TreePage;


public class DSalgoTreeStepDefinition {
	WebDriver driver;
	ConfigReader configReader = new ConfigReader();
	WebDriverWait wait;
	SignInPage signInPage;
	HomePage homepage;
    TreePage treepage;

	public DSalgoTreeStepDefinition() {

		driver = DriverManager.getDriver();
		signInPage = new SignInPage(driver);
		homepage = new HomePage(driver);
	     treepage =new TreePage(driver);
	}
	
	// Scenario: Verify if user able to direct "Overview of Trees" page
	
	@Given("The  user is on the Tree page after logged in")
	public void the_user_is_on_the_tree_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks Overview of Trees link")
	public void the_user_clicks_overview_of_trees_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be redirected to Overview of Trees page")
	public void the_user_should_be_redirected_to_overview_of_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	// Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
	
	@Given("The user is in the Overview of Trees Page")
	public void the_user_is_in_the_overview_of_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks Try Here button in Tree Page")
	public void the_user_clicks_try_here_button_in_tree_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be redirected to a Tree page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_tree_page_having_an_try_editor_with_a_run_button_to_test() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Tree tryEditor page")
	public void the_user_is_on_the_tree_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The User writes valid python code in Tree Page")
	public void the_user_writes_valid_python_code_in_tree_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Click the Run button in Tree Page")
	public void click_the_run_button_in_tree_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User is able to see the output in console of Tree Page")
	public void user_is_able_to_see_the_output_in_console_of_tree_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	// Scenario: Verify if user able to see the error msg in pop up window
	
	@Given("The user is on the Tree tryEditor page")
	public void the_user_is_on_the_tree_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The user writes invalid python code in Tree Page")
	public void the_user_writes_invalid_python_code_in_tree_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Click the Run button in Tree Page")
	public void click_the_run_button_in_tree_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User is able to see the error msg in  Tree Page pop up window")
	public void user_is_able_to_see_the_error_msg_in_tree_page_pop_up_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	//Scenario: Verify if user able to direct to "Terminologies"

	@Given("The  user is on the Tree page after logged in")
	public void the_user_is_on_the_tree_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be redirected to Terminologies Page")
	public void the_user_should_be_redirected_to_terminologies_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	 //Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test

@Given("The user is in the Terminologies Page")
public void the_user_is_in_the_terminologies_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


	  //Scenario: Verify if user able to direct to "Types of Trees"
@Given("The  user is on the Tree page after logged in")
public void the_user_is_on_the_tree_page_after_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("The user clicks Types of Trees link")
public void the_user_clicks_types_of_trees_link() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("The user should be redirected to Types of Trees Page")
public void the_user_should_be_redirected_to_types_of_trees_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	  //Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test

@Given("The user is in the Types of Trees Page")
public void the_user_is_in_the_types_of_trees_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("The user clicks Try Here button in Tree Page")
public void the_user_clicks_try_here_button_in_tree_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("The user should be redirected to a Tree page having an tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_tree_page_having_an_try_editor_with_a_run_button_to_test() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	 // Scenario: Verify if user able to direct to "Tree Traversals"
@Given("The  user is on the Tree page after logged in")
public void the_user_is_on_the_tree_page_after_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("The user clicks Tree Traversals link")
public void the_user_clicks_tree_traversals_link() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("The user should be redirected to Tree Traversals Page")
public void the_user_should_be_redirected_to_tree_traversals_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	  //Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
@Given("The user is in the Tree Traversals Page")
public void the_user_is_in_the_tree_traversals_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	  
	   //Scenario: Verify if user able to direct to "Traversals-Illustration"
@Given("The  user is on the Tree page after logged in")
public void the_user_is_on_the_tree_page_after_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("The user clicks Traversals-Illustration link")
public void the_user_clicks_traversals_illustration_link() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("The user should be redirected to Traversals-Illustration Page")
public void the_user_should_be_redirected_to_traversals_illustration_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	   //Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
@Given("The user is in the Traversals-Illustration Page")
public void the_user_is_in_the_traversals_illustration_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	   
	   //Scenario: Verify if user able to direct to "Binary Trees"
@Given("The  user is on the Tree page after logged in")
public void the_user_is_on_the_tree_page_after_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("The user clicks Binary Trees link")
public void the_user_clicks_binary_trees_link() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("The user should be redirected to Binary Trees Page")
public void the_user_should_be_redirected_to_binary_trees_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	   //Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
@Given("The user is in the Binary Trees Page")
public void the_user_is_in_the_binary_trees_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	   
	  // Scenario: Verify if user able to direct to "Types of Binary Trees"
	   //Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test



//Scenario: Verify if user able to direct to "Implementation in Python"
//@Given("The  user is on the Tree page after logged in")
//public void the_user_is_on_the_tree_page_after_logged_in() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//@When("The user clicks Implementation in Python link")
//public void the_user_clicks_implementation_in_python_link() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//@Then("The user should be redirected to Implementation in Python Page")
//public void the_user_should_be_redirected_to_implementation_in_python_page() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
	 

//Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
@Given("The user is in the Implementation in Python Page")
public void the_user_is_in_the_implementation_in_python_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("The user clicks Try Here button in Tree Page")
public void the_user_clicks_try_here_button_in_tree_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("The user should be redirected to a Tree page having an tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_tree_page_having_an_try_editor_with_a_run_button_to_test() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	
	 //Scenario: Verify if user able to direct to "Binary Tree Traversals"
	  //Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
	
	 //Scenario: Verify if user able to direct to "Implementation of Binary Trees"
	 // Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
	@Given("The user is in the Implementation of Binary Trees Page")
	public void the_user_is_in_the_implementation_of_binary_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks Try Here button in Tree Page")
	public void the_user_clicks_try_here_button_in_tree_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be redirected to a Tree page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_tree_page_having_an_try_editor_with_a_run_button_to_test() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	  
	 // Scenario: Verify if user able to direct to "Applications of Binary trees"
	 // Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test

	  
	  //Scenario: Verify if user able to direct to "Binary Search Trees"
	 // Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test

	  
	 // Scenario: Verify if user able to direct to "Implementation Of BST"
	@Given("The  user is on the Tree page after logged in")
	public void the_user_is_on_the_tree_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks Implementation Of BST link")
	public void the_user_clicks_implementation_of_bst_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be redirected to Implementation Of BST Page")
	public void the_user_should_be_redirected_to_implementation_of_bst_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	 // Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test

	@Given("The user is in the Implementation Of BST Page")
	public void the_user_is_in_the_implementation_of_bst_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks Try Here button in Tree Page")
	public void the_user_clicks_try_here_button_in_tree_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The user should be redirected to a Tree page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_tree_page_having_an_try_editor_with_a_run_button_to_test() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();

	}
	 	  
	 	  
	
}