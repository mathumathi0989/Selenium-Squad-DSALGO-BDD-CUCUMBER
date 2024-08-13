package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsUtilities.ConfigReader;
import dsUtilities.DriverManager;
import dsalgoPOM.HomePage;
import dsalgoPOM.SignOutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalsoSignOutStepDefinition {

    WebDriver driver;
    ConfigReader configReader = new ConfigReader();
	 WebDriverWait   wait;
	 SignOutPage signoutPage;
	 HomePage  homepage;

public DSalsoSignOutStepDefinition() {
	driver = DriverManager.getDriver();
	signoutPage= new SignOutPage(driver);
	homepage  =new HomePage(driver);
}
	
	@When("The user click the Sign out link")
	public void the_user_click_the_sign_out_link() {
	    signoutPage.clickSignout();
	}
	@Then("The user able to see successful message :{string}")
	public void the_user_able_to_see_successful_message(String SignoutAlertMsg) {
		String invalidActualMessage = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		Assert.assertEquals(invalidActualMessage, SignoutAlertMsg);

	}
	@Then("The user should able to see his Register and sign in  link on the right side of the DS Algo Introduction Page")
	public void the_user_should_able_to_see_his_register_and_sign_in_link_on_the_right_side_of_the_ds_algo_introduction_page() {
	   homepage.registert();
	}
}
