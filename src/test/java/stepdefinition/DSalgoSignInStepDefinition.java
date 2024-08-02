package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoSignInStepDefinition {
	WebDriver driver = hooks.getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


	@Given("Open the application for Signin")
	public void open_the_application_for_Signin() {
		driver.get("http://dsportalapp.herokuapp.com/");
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn']")));
		button.click();
	}
		

	@Given("The user is on the DS Algo SignIn Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Boolean isElementPresent = (Boolean) js.executeScript(
				"return document.evaluate(\"//a[normalize-space()='Sign in']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue != null;");
		if (isElementPresent) {
			WebElement signInButton = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Sign in']")));
			signInButton.click();
		} else {
			System.out.println("Element not found");
		}
	}

//Scenario: Verify if user able to signIn with both username and password blank 	

	@When("The user clicks login button after leaving the username textbox and password textbox blank")
	public void the_user_clicks_login_button_after_leaving_the_username_textbox_and_password_textbox_blank() {
		WebElement signInButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")));
		signInButton.click();
	}

	@Then("The error message {string} appears below Username textbox")
	public void the_error_message_appears_below_username_textbox(String uNameError) {
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='id_username']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return arguments[0].validationMessage;";
		String validationMessage = (String) js.executeScript(script, passwordField);
		System.out.println("Validation Error Message: " + validationMessage);
		Assert.assertEquals(uNameError, validationMessage);
	}

//Scenario: Verify if user able to signIn with only password blank

	@When("The user clicks login button after entering the username and leaves password textbox blank")
	public void the_user_clicks_login_button_after_entering_the_username_and_leaves_password_textbox_blank() {
		WebElement usernameField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_username']")));
		usernameField.sendKeys("seleniumsquad");
		WebElement signInButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")));
		signInButton.click();
	}

	@Then("The error message {string} appears below Pwd textbox")
	public void the_error_message_appears_below_pwd_textbox(String pwdError) {
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='id_password']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return arguments[0].validationMessage;";
		String validationMessage = (String) js.executeScript(script, passwordField);
		System.out.println("Validation Error Message: " + validationMessage);
		Assert.assertEquals(pwdError, validationMessage);
	}

//Scenario: Verify if user able to signIn with only username blank 
	@When("The user clicks login button after entering the password only")
	public void the_user_clicks_login_button_after_entering_the_password_only() {
		try {

			WebElement passwordField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_password']")));
			passwordField.sendKeys("numpyninja");

			WebElement signInButton = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")));
			signInButton.click();
		} catch (Exception e) {

		}
	}


//Scenario: Verify if user able to signIn with invalid username and invalid password  

	@When("The user clicks login button after entering invalid username and invalid password")
	public void the_user_clicks_login_button_after_entering_invalid_username_and_invalid_password() {

		try {
			WebElement usernameField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_username']")));
			usernameField.sendKeys("invalidusername");

			WebElement passwordField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_password']")));
			passwordField.sendKeys("invalidpassword");

			WebElement signInButton = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")));
			signInButton.click();
		} catch (Exception e) {

		}
	}



//Scenario: Verify if user able to signIn valid username and invalid password  	

	@When("The user clicks login button after entering valid username and invalid password")
	public void the_user_clicks_login_button_after_entering_valid_username_and_invalid_password() {
		try {
			WebElement usernameField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_username']")));
			usernameField.sendKeys("seleniumsquad");

			WebElement passwordField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_password']")));
			passwordField.sendKeys("numpy");

			WebElement signInButton = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")));
			signInButton.click();
		} catch (Exception e) {

		}
	}

	@Then("The user should able to see an error message {string}.")
	public void the_user_should_able_to_see_an_error_message(String invalidmessage) {
		String invalidActualMessage = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		Assert.assertEquals(invalidActualMessage, invalidmessage);

	}

//Scenario: Verify if user able to signIn invalid username and valid password

	@When("The user clicks login button after entering invalid username and valid password")
	public void the_user_clicks_login_button_after_entering_invalid_username_and_valid_password() {
		try {
			WebElement usernameField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_username']")));
			usernameField.sendKeys("invalidusername");

			WebElement passwordField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_password']")));
			passwordField.sendKeys("numpyninja");

			WebElement signInButton = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")));
			signInButton.click();
		} catch (Exception e) {

		}

	}

//Scenario: Verify if user able to signIn valid username and valid password

	@When("The user clicks login button after entering valid username and valid password")
	public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password() {
		try {
			WebElement usernameField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_username']")));
			usernameField.sendKeys("seleniumsquad");

			WebElement passwordField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_password']")));
			passwordField.sendKeys("numpyninja");

			WebElement signInButton = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")));
			signInButton.click();
		} catch (Exception e) {

		}
	}

	@Then("The user should land in Data Structure Home Page")
	public void the_user_should_land_in_data_structure_home_page() {
		String expectedMessage = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']"))).getText();
		Assert.assertEquals("You are logged in", expectedMessage);
	}
	
}