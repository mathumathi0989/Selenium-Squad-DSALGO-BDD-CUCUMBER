package stepdefinition;

import java.time.Duration;

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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoHomePageStepDefinition {

	WebDriver driver;
	ConfigReader configReader = new ConfigReader();
	WebDriverWait wait;
	SignInPage signInPage;
	HomePage homepage;

	public DSalgoHomePageStepDefinition() {
		driver = DriverManager.getDriver();
		signInPage = new SignInPage(driver);
		homepage = new HomePage(driver);

	}

	// Background: User is on HomePage

	@Given("The user is on the DS Algo portal")
	public void the_user_is_on_the_ds_algo_portal() {
		driver.get(configReader.getProperty("baseUrl"));
		LoggerLoad.info("User opens DS Algo portal link");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@When("The user clicks Getstarted button")
	public void the_user_clicks_getstarted_button() {
		homepage.clickstart();

	}

	@Then("The user should land on DSAlgo Homepage")
	public void the_user_should_land_on_ds_algo_homepage() {
		System.out.println(driver.getTitle());
		LoggerLoad.info("user landed  DSAlgo Homepage");

	}

	// Scenario Outline: Verify if user able to select datastructure "option"
	// dropdown in homepage without signin

	@Given("The user is on Homepage")
	public void the_user_is_on_homepage() {
		System.out.println(driver.getTitle());
	}

//

	@When("The user clicks datastructures dropdown and select")
	public void the_user_clicks_datastructures_dropdown_and_select() {
		// homepage.dropdown(Arrays);
		// homepage.selectDropdown(string);
		homepage.selectDataStructuresrequired();
		LoggerLoad.info("user clicks the DS dropdown");

	}

	@Then("The error message {string} appears in homepage")
	public void the_error_message_appears_in_homepage(String invalidmessage) {

		WebElement ele = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-primary']")));
		String ActualMessage = ele.getText();
		System.out.println(ActualMessage);
		Assert.assertEquals(ActualMessage, invalidmessage);

	}

	// Scenario Outline: Verify if user able to click getstarted to select
	// datastructure "option" in homepage without signin

	@When("The user clicks on DS Get Started link on homepage without SigningIn")
	public void the_user_clicks_on_ds_get_started_link_on_homepage_without_signing_in() {
		homepage.selectDataStructuresmodule();
		LoggerLoad.info("user clicks the DS Get Started link on homepage");

	}

	// Scenario: Verify if user is on Home page and click on sign in

	@When("The user clicks on signin link")
	public void the_user_clicks_on_signin_link() {
		WebElement signInButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Sign in']")));

		signInButton.click();
	}

	@Then("The user is redirected to login page")
	public void the_user_is_redirected_to_login_page() {
		System.out.println(driver.getTitle());
		LoggerLoad.info("user landed  DSAlgo Signin Page");
	}

//  Scenario: Verify if user is on Home page and click on Register

	@When("The user clicks on register link")
	public void the_user_clicks_on_register_link() {

		homepage.register();
	}

	@Then("The user redirected to Registration page")
	public void the_user_redirected_to_registration_page() {
		System.out.println(driver.getTitle());
		LoggerLoad.info("user landed  DSAlgo Register Page");
		
	}
}