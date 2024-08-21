package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsUtilities.ConfigReader;
import dsUtilities.DriverManager;
import dsUtilities.LoggerLoad;
import dsalgoPOM.HomePage;
import dsalgoPOM.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoRegisterStepDefinition {


    WebDriver driver;
    ConfigReader configReader = new ConfigReader();
	 WebDriverWait   wait;
	 RegisterPage registerPage;
	 HomePage  homepage;
	 

public DSalgoRegisterStepDefinition() {
	 driver = DriverManager.getDriver();
	    registerPage = new RegisterPage(driver);
	    homepage = new HomePage(driver);
}




@Given("The user is on the new user registration page")
public void the_user_is_on_the_new_user_registration_page() {

	driver.get(configReader.getProperty("baseUrl") + "/register");
	wait= new WebDriverWait(driver, Duration.ofSeconds(10));

	
	
}
@When("The user clicks Register button with all fields empty")
public void the_user_clicks_register_button_with_all_fields_empty() {
	
	registerPage.registerButton();
	
}
@Then("The error {string} appears below Username textbox")
public void the_error_appears_below_username_textbox(String uNameError) {

	
	WebElement usernameField = driver.findElement(By.xpath("//input[@id='id_username']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String script = "return arguments[0].validationMessage;";
	String validationMessage = (String) js.executeScript(script, usernameField);
	System.out.println("Validation Error Message: " + validationMessage);
	Assert.assertEquals(uNameError, validationMessage);
	
}



@When("The user clicks Register button after entering Username with other fields empty")
public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty() {

	registerPage.enterUsername(configReader.getProperty("newuser"));
	registerPage.registerButton();
	
	
	
}
@Then("The error message {string} appears below Password textbox")
public void the_error_message_appears_below_password_textbox(String uPwdError) {

	WebElement usernameField = driver.findElement(By.xpath("//input[@id='id_password1']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String script = "return arguments[0].validationMessage;";
	String validationMessage = (String) js.executeScript(script, usernameField);
	System.out.println("Validation Error Message: " + validationMessage);
	Assert.assertEquals(uPwdError, validationMessage);
	
	
}




@When("The user clicks Register button after entering Username and password with Password Confirmation field empty")
public void the_user_clicks_register_button_after_entering_username_and_password_with_password_confirmation_field_empty() {

	registerPage.enterUsername(configReader.getProperty("newuser"));
	registerPage.enterPassword(configReader.getProperty("newpwd"));
	registerPage.registerButton();
	
	
}
@Then("Then The error message {string} appears below Password Confirmation textbox")
public void then_the_error_message_appears_below_password_confirmation_textbox(String uPwdConfirmError) {

	WebElement usernameField = driver.findElement(By.xpath("//input[@id='id_password2']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String script = "return arguments[0].validationMessage;";
	String validationMessage = (String) js.executeScript(script, usernameField);
	System.out.println("Validation Error Message: " + validationMessage);
	Assert.assertEquals(uPwdConfirmError, validationMessage);
	
	
}


@When("The user clicks Register button after entering a username with spacebar characters")
public void the_user_clicks_register_button_after_entering_a_username_with_spacebar_characters() {

	registerPage.enterUsername("invalid-username");
	registerPage.registerButton();
	
	
}

@Then("The user should see error msg after entering invalid data in username field")
public void the_user_should_see_error_msg_after_entering_invalid_data_in_username_field() {

	WebElement usernameField = driver.findElement(By.xpath("//input[@id='id_username']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String script = "return arguments[0].validationMessage;";
	String validationMessage = (String) js.executeScript(script, usernameField);
	System.out.println("Validation Error Message: " + validationMessage);
	Assert.assertEquals(validationMessage, "Please fill out this field.");
	
}

@Then("The user should see error msg after entering invalid data in password field")
public void the_user_should_see_error_msg_after_entering_invalid_data_in_password_field() {

	WebElement usernameField = driver.findElement(By.xpath("//input[@id='id_password1']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String script = "return arguments[0].validationMessage;";
	String validationMessage = (String) js.executeScript(script, usernameField);
	System.out.println("Validation Error Message: " + validationMessage);
	Assert.assertEquals(validationMessage, "Please fill out this field.");
	
}





@When("The user clicks Register button after entering a password with numeric data")
public void the_user_clicks_register_button_after_entering_a_password_with_numeric_data() {
	registerPage.enterUsername(configReader.getProperty("newuser"));
	registerPage.enterPassword("123423");
	registerPage.registerButton();
}







@When("The user clicks Register button after entering a Password with characters less than {int}")
public void the_user_clicks_register_button_after_entering_a_password_with_characters_less_than(Integer int1) {

	registerPage.enterUsername(configReader.getProperty("newuser"));
	registerPage.enterPassword("passle");
	registerPage.registerButton();
}




@When("The user clicks {string} button after entering different passwords in Password and Password Confirmation fields")
public void the_user_clicks_button_after_entering_different_passwords_in_password_and_password_confirmation_fields(String string) throws Exception {
	registerPage.enterUsername(configReader.getProperty("newuser"));
	registerPage.enterPassword("password");
	registerPage.enterConfirmPassword("drowssap");
	registerPage.registerButton();
	Thread.sleep(3000);
	
}
@Then("The user should able to see an pwd warning message {string}")
public void the_user_should_able_to_see_an_pwd_warning_message(String string) {

	String actualMessage = wait
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']"))).getText();
	System.out.println(actualMessage);
	Assert.assertEquals(actualMessage, "password_mismatch:The two password fields didn’t match.");
	
}



@When("The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes")
public void the_user_clicks_register_button_after_entering_with_valid_username_password_and_password_confirmation_in_related_textboxes() throws Exception {

	registerPage.enterUsername(configReader.getProperty("newuser"));
	registerPage.enterPassword(configReader.getProperty("newpwd"));
	registerPage.enterConfirmPassword(configReader.getProperty("newpwd"));
	registerPage.registerButton();
	Thread.sleep(3000);
	
}
@Then("The user should be redirected to Home Page of DS Algo and The user should able to see  successful message {string}  on  the DS Algo Home Page")
public void the_user_should_be_redirected_to_home_page_of_ds_algo_and_the_user_should_able_to_see_successful_message_on_the_ds_algo_home_page(String newaccountMessage){

	String actualMessage = wait
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']"))).getText();
	System.out.println(actualMessage);
	String expectedMessage = "New Account Created. You are logged in as "+configReader.getProperty("newuser");
	Assert.assertEquals(actualMessage, expectedMessage);
	String actualtitle = driver.getTitle();
	Assert.assertEquals(actualtitle, "NumpyNinja");
	LoggerLoad.info("user registered successfully");

	
	
}





}
