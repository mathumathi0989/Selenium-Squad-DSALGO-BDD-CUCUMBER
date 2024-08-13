package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		treepage = new TreePage(driver);
	}

	// Scenario: Verify if user able to direct "Overview of Trees" page

	@Given("The  user is on the Tree page after logged in")
	public void the_user_is_on_the_tree_page_after_logged_in() {
		homepage.selectTree();
	}

	@When("The user clicks Overview of Trees link")
	public void the_user_clicks_overview_of_trees_link() {
		treepage.verifyoverviewTrees();

	}

	@Then("The user should be redirected to Overview of Trees page")
	public void the_user_should_be_redirected_to_overview_of_trees_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Overview of Trees']")).getText();
		Assert.assertEquals(actual, "Overview of Trees");
		LoggerLoad.info("user redirected to Overview of Trees page");
	}

	// Scenario: Verify if user able to to redirect to a page having an tryEditor
	// with a Run button to test

	@Given("The user is in the Overview of Trees Page")
	public void the_user_is_in_the_overview_of_trees_page() {
		homepage.selectTree();
		treepage.verifyoverviewTrees();

	}

	@When("The user clicks Try Here button in Tree Page")
	public void the_user_clicks_try_here_button_in_tree_page() {
		treepage.tryhereButton();
	}

	@Then("The user should be redirected to a Tree page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_tree_page_having_an_try_editor_with_a_run_button_to_test() {
		System.out.println(driver.getTitle());
	}

	// Scenario: Verify if user able to see the output in console
	@Given("The user is on the Tree tryEditor page")
	public void the_user_is_on_the_tree_try_editor_page() {
		homepage.selectTree();
		treepage.verifyoverviewTrees();
		treepage.tryhereButton();
		System.out.println(driver.getTitle());

	}

	@When("The User writes valid python code in Tree Page")
	public void the_user_writes_valid_python_code_in_tree_page() {
		treepage.tryhere("print\"hello\"");
	}

	@When("Click the Run button in Tree Page")
	public void click_the_run_button_in_tree_page() {
		treepage.runButton();
	}

	@Then("User is able to see the output in console of Tree Page")
	public void user_is_able_to_see_the_output_in_console_of_tree_page() {
		treepage.outputconsole();
		LoggerLoad.info("user validated valid code in Tree page");

	}

	// Scenario: Verify if user able to see the error msg in pop up window

	@When("The user writes invalid python code in Tree Page")
	public void the_user_writes_invalid_python_code_in_tree_page() {
		treepage.tryhere("printf");
	}

	@Then("User is able to see the error msg in  Tree Page pop up window")
	public void user_is_able_to_see_the_error_msg_in_tree_page_pop_up_window() {
		treepage.output();
		LoggerLoad.info("user validated invalid code in Tree page");
	}

	// Scenario: Verify if user able to direct to "Terminologies"

	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {
		treepage.verifyterminologies();
	}

	@Then("The user should be redirected to Terminologies Page")
	public void the_user_should_be_redirected_to_terminologies_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Terminologies']")).getText();
		Assert.assertEquals(actual, "Terminologies");
		LoggerLoad.info("user redirected to Terminologies page");
	}
	// Scenario: Verify if user able to to redirect to a page having an tryEditor
	// with a Run button to test

	@Given("The user is in the Terminologies Page")
	public void the_user_is_in_the_terminologies_page() {
		homepage.selectTree();
		treepage.verifyterminologies();

	}
	// Scenario: Verify if user able to direct to "Types of Trees"

	@When("The user clicks Types of Trees link")
	public void the_user_clicks_types_of_trees_link() {
		treepage.verifytypesTrees();
	}

	@Then("The user should be redirected to Types of Trees Page")
	public void the_user_should_be_redirected_to_types_of_trees_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Types of Trees']")).getText();
		Assert.assertEquals(actual, "Types of Trees");
		LoggerLoad.info("user redirected to Types of Trees page");
	}

	// Scenario: Verify if user able to to redirect to a page having an tryEditor
	// with a Run button to test

	@Given("The user is in the Types of Trees Page")
	public void the_user_is_in_the_types_of_trees_page() {
		homepage.selectTree();
		treepage.verifytypesTrees();

	}

	// Scenario: Verify if user able to direct to "Tree Traversals"

	@When("The user clicks Tree Traversals link")
	public void the_user_clicks_tree_traversals_link() {
		treepage.verifytreeTraversals();
	}

	@Then("The user should be redirected to Tree Traversals Page")
	public void the_user_should_be_redirected_to_tree_traversals_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Tree Traversals']")).getText();
		Assert.assertEquals(actual, "Tree Traversals");
		LoggerLoad.info("user redirected to Tree Traversals page");
	}

	// Scenario: Verify if user able to to redirect to a page having an tryEditor
	// with a Run button to test
	@Given("The user is in the Tree Traversals Page")
	public void the_user_is_in_the_tree_traversals_page() {
		homepage.selectTree();
		treepage.verifytreeTraversals();

	}

	// Scenario: Verify if user able to direct to "Traversals-Illustration"

	@When("The user clicks Traversals-Illustration link")
	public void the_user_clicks_traversals_illustration_link() {

		treepage.verifytraversalsIllustration();
	}

	@Then("The user should be redirected to Traversals-Illustration Page")
	public void the_user_should_be_redirected_to_traversals_illustration_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Traversals-Illustration']")).getText();
		Assert.assertEquals(actual, "Traversals-Illustration");
		LoggerLoad.info("user redirected to Traversals-Illustration page");
	}

	// Scenario: Verify if user able to to redirect to a page having an tryEditor
	// with a Run button to test
	@Given("The user is in the Traversals-Illustration Page")
	public void the_user_is_in_the_traversals_illustration_page() {
		homepage.selectTree();
		treepage.verifytraversalsIllustration();
	}

	// Scenario: Verify if user able to direct to "Binary Trees"

	@When("The user clicks Binary Trees link")
	public void the_user_clicks_binary_trees_link() {
		treepage.verifybinaryTrees();
	}

	@Then("The user should be redirected to Binary Trees Page")
	public void the_user_should_be_redirected_to_binary_trees_page() {

		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Binary Trees']")).getText();
		Assert.assertEquals(actual, "Binary Trees");
		LoggerLoad.info("user redirected to Binary Trees page");

	}

	// Scenario: Verify if user able to to redirect to a page having an tryEditor
	// with a Run button to test
	@Given("The user is in the Binary Trees Page")
	public void the_user_is_in_the_binary_trees_page() {
		homepage.selectTree();
		treepage.verifybinaryTrees();

	}

	// Scenario: Verify if user able to direct to "Types of Binary Trees"
	@When("The user clicks Types of Binary Trees link")
	public void the_user_clicks_types_of_binary_trees_link() {
		treepage.verifytypesBinaryTrees();
	}

	@Then("The user should be redirected to Types of Binary Trees Page")
	public void the_user_should_be_redirected_to_types_of_binary_trees_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Types of Binary Trees']")).getText();
		Assert.assertEquals(actual, "Types of Binary Trees");
		LoggerLoad.info("user redirected to Types of Binary Trees page");

	}

	// Scenario: Verify if user able to to redirect to a page having an tryEditor
	// with a Run button to test

	@Given("The user is in the Types of Binary Trees Page")
	public void the_user_is_in_the_types_of_binary_trees_page() {
		homepage.selectTree();
		treepage.verifytypesBinaryTrees();

	}

//Scenario: Verify if user able to direct to "Implementation in Python"

	@When("The user clicks Implementation in Python link")
	public void the_user_clicks_implementation_in_python_link() {
		treepage.verifyimplementationPython();

	}

	@Then("The user should be redirected to Implementation in Python Page")
	public void the_user_should_be_redirected_to_implementation_in_python_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Implementation in Python']")).getText();
		Assert.assertEquals(actual, "Implementation in Python");
		LoggerLoad.info("user redirected to Implementation in Python page");
	}

//Scenario: Verify if user able to to redirect to a page having an tryEditor with a Run button to test
	@Given("The user is in the Implementation in Python Page")
	public void the_user_is_in_the_implementation_in_python_page() {
		homepage.selectTree();
		treepage.verifyimplementationPython();

	}

	// Scenario: Verify if user able to direct to "Binary Tree Traversals"

	@When("The user clicks Binary Tree Traversals link")
	public void the_user_clicks_Binary_tree_traversals_link() {
		treepage.verifybinaryTreeTraversals();
	}

	@Then("The user should be redirected to Binary Tree Traversals Page")
	public void the_user_should_be_redirected_to_binary_tree_traversals_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Binary Tree Traversals']")).getText();
		Assert.assertEquals(actual, "Binary Tree Traversals");
		LoggerLoad.info("user redirected to Binary Tree Traversals page");

	}

	// Scenario: Verify if user able to to redirect to a page having an tryEditor
	// with a Run button to test

	@Given("The user is in the Binary Tree Traversals Page")
	public void the_user_is_in_the_binary_tree_traversals_page() {
		homepage.selectTree();
		treepage.verifybinaryTreeTraversals();

	}
	// Scenario: Verify if user able to direct to "Implementation of Binary Trees"

	@When("The user clicks Implementation of Binary Trees link")
	public void the_user_clicks_implementation_of_binary_trees_link() {
		treepage.verifyimplementationBinaryTrees();
	}

	@Then("The user should be redirected to Implementation of Binary Trees Page")
	public void the_user_should_be_redirected_to_implementation_of_binary_trees_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Implementation of Binary Trees']")).getText();
		Assert.assertEquals(actual, "Implementation of Binary Trees");
		LoggerLoad.info("user redirected to Implementation of Binary Trees page");
	}

	// Scenario: Verify if user able to to redirect to a page having an tryEditor
	// with a Run button to test
	@Given("The user is in the Implementation of Binary Trees Page")
	public void the_user_is_in_the_implementation_of_binary_trees_page() {
		homepage.selectTree();
		treepage.verifyimplementationBinaryTrees();

	}

	// Scenario: Verify if user able to direct to "Applications of Binary trees"

	@When("The user clicks Applications of Binary trees link")
	public void the_user_clicks_applications_of_binary_trees_link() {
		treepage.verifyapplicationsofBinarytrees();
	}

	@Then("The user should be redirected to Applications of Binary trees Page")
	public void the_user_should_be_redirected_to_applications_of_binary_trees_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Applications of Binary trees']")).getText();
		Assert.assertEquals(actual, "Applications of Binary trees");
		LoggerLoad.info("user redirected to Applications of Binary trees page");
	}

	// Scenario: Verify if user able to to redirect to a page having an tryEditor
	// with a Run button to test
	@Given("The user is in the Applications of Binary trees Page")
	public void the_user_is_in_the_applications_of_binary_trees_page() {
		homepage.selectTree();
		treepage.verifyapplicationsofBinarytrees();

	}

	// Scenario: Verify if user able to direct to "Binary Search Trees"

	@When("The user clicks Binary Search Trees link")
	public void the_user_clicks_binary_search_trees_link() {
		treepage.verifybinarySearchTrees();
	}

	@Then("The user should be redirected to Binary Search Trees Page")
	public void the_user_should_be_redirected_to_binary_search_trees_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Binary Search Trees']")).getText();
		Assert.assertEquals(actual, "Binary Search Trees");
		LoggerLoad.info("user redirected to Binary Search Trees page");
	}

	// Scenario: Verify if user able to to redirect to a page having an tryEditor
	// with a Run button to test
	@Given("The user is in the Binary Search Trees Page")
	public void the_user_is_in_the_binary_search_trees_page() {
		homepage.selectTree();
		treepage.verifybinarySearchTrees();

	}

	// Scenario: Verify if user able to direct to "Implementation Of BST"

	@When("The user clicks Implementation Of BST link")
	public void the_user_clicks_implementation_of_bst_link() {
		treepage.verifyimplementationBst();
	}

	@Then("The user should be redirected to Implementation Of BST Page")
	public void the_user_should_be_redirected_to_implementation_of_bst_page() {
		System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[text()='Implementation Of BST']")).getText();
		Assert.assertEquals(actual, "Implementation Of BST");
		LoggerLoad.info("user redirected to Implementation Of BST page");
	}
	// Scenario: Verify if user able to to redirect to a page having an tryEditor
	// with a Run button to test

	@Given("The user is in the Implementation Of BST Page")
	public void the_user_is_in_the_implementation_of_bst_page() {
		homepage.selectTree();
		treepage.verifyimplementationBst();

	}

}