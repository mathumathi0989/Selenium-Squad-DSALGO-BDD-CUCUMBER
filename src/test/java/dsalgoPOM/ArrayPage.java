package dsalgoPOM;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrayPage {

	WebDriver driver;
	WebDriverWait wait;
	public Alert alert;

	By arrayTitle = By.xpath("//a[@href='Array']");
	By arraysinpython = By.xpath("//a[normalize-space()='Arrays in Python']");
	By arraysusinglist = By.xpath("//a[normalize-space()='Arrays Using List']");
	By basicoperationsinlists = By.xpath("//a[normalize-space()='Basic Operations in Lists']");
	By applicationsofarray = By.xpath("//a[normalize-space()='Applications of Array']");

	By practiceQues = By.linkText("Practice Questions");

	By searchArray = By.linkText("Search the array");
	By maxConsecutive = By.xpath("//a[normalize-space()='Max Consecutive Ones']");
	By findNumbers = By.xpath("//a[normalize-space()='Find Numbers with Even Number of Digits']");
	By squaresOf = By.xpath("//a[contains(text(),'Squares of')]");

	By tryhere = By.xpath("//a[@class='btn btn-info']");
	By RunButton = By.xpath("//button[@type='button']");
	By output = By.xpath("//pre[@id='output']");
	By submit = By.xpath("//input[@type='submit']");

	public ArrayPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	}

	public void selectArraysinpythonPracticeQues() {

		WebElement element = driver.findElement(practiceQues);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void selectsearchArrayprac() {

		WebElement element = driver.findElement(searchArray);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void selectmaxConsecutive() {

		WebElement element = driver.findElement(maxConsecutive);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void selectfindNumbers() {

		WebElement element = driver.findElement(findNumbers);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void selectsquaresOf() {

		WebElement element = driver.findElement(squaresOf);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void clearTryeditorAndExecuteCode(String code) {

		WebElement codeMirrorElement = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='CodeMirror-scroll']")));

		// JavaScript to clear the CodeMirror editor
		String clearScript = "var editor = document.querySelector('.CodeMirror').CodeMirror;" + "editor.setValue('');";
		// Sets the value to an empty string, effectively clearing it
		// Execute the script to clear the editor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(clearScript);

		// python code to enter into the CodeMirror editor
		System.out.println("Executing: " + code);
		// JavaScript to set the code in the CodeMirror editor
		String enterCodeScript = "var editor = document.querySelector('.CodeMirror').CodeMirror;"
				+ "editor.setValue(arguments[0]);";

		// Execute the script to enter the code
		js.executeScript(enterCodeScript, code);

	}

	public void submit() {

		WebElement element = driver.findElement(submit);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void verifyArraysInPythonPage() {

		WebElement element = driver.findElement(arraysinpython);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}

	public void verifyArraysUsingListPage() {

		WebElement element = driver.findElement(arraysusinglist);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void verifyBasicOperationsInListsPage() {

		WebElement element = driver.findElement(basicoperationsinlists);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void verifyApplicationsOfArrayPage() {

		WebElement element = driver.findElement(applicationsofarray);
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

		return driver.findElement(output).getText();
		// System.out.println(executed);

	}

	public void output() {

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
