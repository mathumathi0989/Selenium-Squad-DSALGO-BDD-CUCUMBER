package dsalgoPOM;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QueuePage {

	WebDriver driver;
	WebDriverWait wait;

	By queueTitle = By.xpath("//h4[text()='Queue']");
	By ImplementationofQueue = By.linkText("Implementation of Queue in Python");
	By ImplementationCollections = By.linkText("Implementation using collections.deque");
	By ImplementationArray = By.linkText("Implementation using array");
	By OperationsQueue = By.linkText("Queue Operations");
	By practiceQues = By.linkText("Practice Questions");

	By tryhere = By.xpath("//a[@class='btn btn-info']");
	By RunButton = By.xpath("//button[@type='button']");
	By output = By.xpath("//pre[@id='output']");

	public QueuePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	}

	public void verifyImplementationofQueue() {

		WebElement element = driver.findElement(ImplementationofQueue);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}

	public void verifyImplementationCollections() {

		WebElement element = driver.findElement(ImplementationCollections);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}

	public void verifyImplementationArray() {

		WebElement element = driver.findElement(ImplementationArray);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}

	public void verifyOperationsQueue() {

		WebElement element = driver.findElement(OperationsQueue);
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

	public void outputconsole() {

		String executed = driver.findElement(output).getText();
		System.out.println(executed);

	}

	public void output() {
		try {
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
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
