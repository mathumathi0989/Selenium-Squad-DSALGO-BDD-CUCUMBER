package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
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

public class DSalgoDataStructuresStepDefinition {
	
	WebDriver driver = hooks.getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	public String code;
	//Background-   Given Open the application
	@Given("Open the application")
	public void open_the_application() {
		driver.get("http://dsportalapp.herokuapp.com/");
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn']")));
		button.click();
		DSalgoSignInStepDefinition dsSignIn = new DSalgoSignInStepDefinition();
		dsSignIn.the_user_is_on_the_ds_algo_sign_in_page();
		dsSignIn.the_user_clicks_login_button_after_entering_valid_username_and_valid_password();
	}
		
	//Scenario: Verify if user able to access data structure homepage
		@Given("The user is on the Home page")
		public void the_user_is_on_the_home_page() {
			String pageTitle=driver.getTitle();
			System.out.println(pageTitle);
		}
		@When("The user clicks on DataStructure Get Started button")
		public void the_user_clicks_on_data_structure_get_started_button() {
			driver.findElement(By.xpath("//a[@href='data-structures-introduction']")).click();
		}
		
		@Then("The user should be redirected to the data structure homepage")
		public void the_user_should_be_redirected_to_the_data_structure_homepage() {
			
			String actualdDsTitle=driver.getTitle();
			String expectedDsTitle="Data Structures-Introduction";
	      Assert.assertEquals(actualdDsTitle, expectedDsTitle, "Values are not equal!");
	     
		}
			
		//Scenario: Verify if user able to access topics covered section
		
		
		@Given("The  user is on the data structure homepage")
		public void the_user_is_on_the_data_structure_homepage() {
			driver.findElement(By.xpath("//a[@href='data-structures-introduction']")).click();
		//	String dsPageTitle=driver.getTitle();
		//	System.out.println(dsPageTitle);
			
		}
		@When("The user clicks on Topics covered")
		public void the_user_clicks_on_topics_covered() {  
			driver.findElement(By.xpath("//a[@href='time-complexity']")).click();
		}
		@Then("The user should be redirected to selected topic covered page")
		public void the_user_should_be_redirected_to_selected_topic_covered_page() {
			String actualTcTitle=driver.getTitle();
			String expectedTcTitle="Time Complexity";
	      Assert.assertEquals(actualTcTitle, expectedTcTitle, "Values are not equal!");
			
		}
			
		//Scenario: Verify if user able to view the python editor page from topics covered section
		@Given("The user is on the selected topic covered page")
		public void the_user_is_on_the_selected_topic_covered_page() {
			//driver.findElement(By.xpath("//a[@href='data-structures-introduction']")).click();
			String dsPageTitle=driver.getTitle();
			System.out.println(dsPageTitle);
		
		}
		@When("The user clicks Try Here button")
		public void the_user_clicks_try_here_button() {
			driver.findElement(By.xpath("//a[text()='Try here>>>']")).click();	
		}
		@Then("The user should be redirected to a page having an Python Editor")
		public void the_user_should_be_redirected_to_a_page_having_an_python_editor() {
			String actualTitle=driver.getTitle();
			String expectedTitle="Assessment";
	      Assert.assertEquals(actualTitle, expectedTitle, "Values are not equal!");
		}
		
		
		 //Scenario: Verify if user able to validate the python editor with empty data
		
		@When("Click the Run button")
		public void click_the_run_button() {
			driver.findElement(By.xpath("//button[text()='Run]")).click();
		}
		
		//Scenario: Verify if user able to validate the python editor with invalid data
		
		
		
		
		
		//Scenario: Verify if user able to validate the python editor with valid data
		
		@Given("The user is on the Python Editor")
		public void the_user_is_on_the_python_editor() {
			String dsPageTitle=driver.getTitle();
			System.out.println(dsPageTitle);
		  
		}
		@When("The user enter {string} code in Editor")
		public void the_user_enter_code_in_editor(String codeValue) {
			String script = "var editor = document.querySelector('.CodeMirror').CodeMirror;" +
	              "editor.setValue(arguments[0]);";
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	     
	      if(codeValue.equalsIgnoreCase("empty")) {
	      	
	      	code="";
	      }
	      else if(codeValue.equalsIgnoreCase("valid")) {
	      	code="print\"hello\"";
	      }
	      else{
	      code="Anusuya";	
	      }
	      js.executeScript(script,code);
		}
		
		@Then("The user is validated with expected result")
		public void the_user_is_validated_with_expected_result() {
			
			WebElement output=driver.findElement(By.xpath("//pre[@id='output']"));
			try {
	          Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	          System.out.println("Alert message: " + alert.getText());
	          alert.accept();
	      } catch (Exception e) {
	          try {
	              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//pre[@id='output']")));
	              String codeOutput = output.getText();
	              System.out.println("Code output: " + codeOutput);
	          } catch (Exception ex) {
	              System.out.println("No output element found or no output generated.");
	          }
	      }	 
		}
			
	//Scenario: Verify if user able to view practice page
		
		@Given("The  user is on the Time Complexity page")
		public void the_user_is_on_the_time_complexity_page() {
			String dsPageTitle=driver.getTitle();
			System.out.println(dsPageTitle);
		}
		@When("The user clicks Practice Questions link")
		public void the_user_clicks_practice_questions_link() {
			driver.findElement(By.xpath("//a[text()='Practice Questions']")).click();
		}
		@Then("The user should be redirected to Practice page")
		public void the_user_should_be_redirected_to_practice_page() {
			String actualdDsTitle=driver.getTitle();
			String expectedDsTitle="Practice Questions";
	      Assert.assertEquals(actualdDsTitle, expectedDsTitle, "Values are not equal!");
		}
	//hhhhheeeellooo
}
