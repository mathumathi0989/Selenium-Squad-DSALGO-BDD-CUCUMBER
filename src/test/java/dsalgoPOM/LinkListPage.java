package dsalgoPOM;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkListPage {

	WebDriver driver;
	WebDriverWait wait;
	public String executed;
	public Alert alert;
	By linklistTitle = By.xpath("//a[@href='linked-list']");
	By introduction = By.xpath("//a[normalize-space()='Introduction']");
	By creatinglinkedlist = By.xpath("//a[normalize-space()='Creating Linked LIst']");
	By typesoflinkedlist = By.xpath("//a[normalize-space()='Types of Linked List']");
	By implementlinkedlist = By.xpath("//a[normalize-space()='Implement Linked List in Python']");
	By traversal = By.xpath("//a[normalize-space()='Traversal']");
	By insertion = By.xpath("//a[normalize-space()='Insertion']");
	By deletion = By.xpath("//a[normalize-space()='Deletion']");
	By practiceQues = By.linkText("Practice Questions");

	By tryhere = By.xpath("//a[@class='btn btn-info']");
	By RunButton = By.xpath("//button[@type='button']");
	By output = By.xpath("//pre[@id='output']");

	public LinkListPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	}

	public void verifyIntroductionPage() {

		WebElement element = driver.findElement(introduction);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}

	public void verifyCreatingLinkedListPage() {

		WebElement element = driver.findElement(creatinglinkedlist);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void verifyTypesOfLinkedListPage() {

		WebElement element = driver.findElement(typesoflinkedlist);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void verifyImplementLinkedListPage() {

		WebElement element = driver.findElement(implementlinkedlist);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void verifyTraversalPage() {

		WebElement element = driver.findElement(traversal);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void verifyInsertionPage() {

		WebElement element = driver.findElement(insertion);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void verifyDeletionPage() {

		WebElement element = driver.findElement(deletion);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void verifyPracticePage() {

		WebElement element = driver.findElement(practiceQues);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void tryhereButton() {

		WebElement element = driver.findElement(tryhere);
		element.click();
	}

	public void tryhere(String code) {

		String script = "var editor = document.querySelector('.CodeMirror').CodeMirror;"
				+ "editor.setValue(arguments[0]);";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, code);

	}

	public void runButton() {
		WebElement runButton = driver.findElement(RunButton);
		runButton.click();

	}

	public String outputconsole() {

		return executed = driver.findElement(output).getText();

	}

	public void outputt() {

		try {
			alert = wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Alert message: " + alert.getText());
			alert.accept();
		} catch (Exception e) {
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(output));
				String codeOutput = driver.findElement(output).getText();
				System.out.println("Code output: " + codeOutput);
			} catch (Exception ex) {
				System.out.println("No output element found or no output generated.");
			}
		}
	}

}
