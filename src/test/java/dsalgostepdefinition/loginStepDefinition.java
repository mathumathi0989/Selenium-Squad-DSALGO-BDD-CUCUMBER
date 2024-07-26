package dsalgostepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinition {

	@Given("click on login")
	public void click_on_login() {
	   System.out.println("clicked login");
	}
	@When("user enters uname and pwd")
	public void user_enters_uname_and_pwd() {
	   System.out.println("entered username and password");
	}
	@When("click on login button")
	public void click_on_login_button() {
	   System.out.println("clciked login button");
	}
	@Then("dashboard page appears")
	public void dashboard_page_appears() {
	   System.out.println("dashboard page appeared");
	}
	
}
