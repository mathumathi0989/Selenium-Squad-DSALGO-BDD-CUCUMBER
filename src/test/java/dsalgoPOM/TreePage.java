package dsalgoPOM;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TreePage {
	
	WebDriver driver;
	WebDriverWait wait;

	By treeTitle = By.xpath("//h4[text()='Tree']");
	By overviewTrees = By.linkText("Overview of Trees");
	By terminologies= By.linkText("Terminologies");
	By typesTrees= By.linkText("Types of Trees");
	By treeTraversals = By.linkText("Tree Traversals");
	By traversalsIllustration = By.linkText("Traversals-Illustration");
	By binaryTrees= By.linkText("Binary Trees");
	By typesBinaryTrees= By.linkText("Types of Binary Trees");
	By implementationPython= By.linkText("Implementation in Python");
	By binaryTreeTraversals= By.linkText("Binary Tree Traversals");
	By implementationBinaryTrees= By.linkText("Implementation of Binary Trees");
	By applicationsofBinarytrees= By.linkText("Applications of Binary trees");
	By binarySearchTrees= By.linkText("Binary Search Trees");
	By implementationBst= By.linkText("Implementation Of BST");	
	By tryhere = By.xpath("//a[@class='btn btn-info']");
	By RunButton = By.xpath("//button[@type='button']");
	By output = By.xpath("//pre[@id='output']");

	public TreePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	}

	public void verifyoverviewTrees() {

		WebElement element = driver.findElement(overviewTrees);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}

	public void verifyterminologies() {

		WebElement element = driver.findElement(terminologies);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}

	public void verifytypesTrees() {

		WebElement element = driver.findElement(typesTrees);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}

	public void verifytreeTraversals() {

		WebElement element = driver.findElement(treeTraversals);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}

	public void verifytraversalsIllustration() {

		WebElement element = driver.findElement(traversalsIllustration);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	
	public void verifybinaryTrees() {

		WebElement element = driver.findElement(binaryTrees);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	public void verifytypesBinaryTrees() {

		WebElement element = driver.findElement(typesBinaryTrees);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	
	public void verifyimplementationPython() {

		WebElement element = driver.findElement(implementationPython);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	
	public void verifybinaryTreeTraversals() {

		WebElement element = driver.findElement(binaryTreeTraversals);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	
	public void verifyimplementationBinaryTrees() {

		WebElement element = driver.findElement(implementationBinaryTrees);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	
	public void verifyapplicationsofBinarytrees() {

		WebElement element = driver.findElement(applicationsofBinarytrees);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	
	public void verifybinarySearchTrees() {

		WebElement element = driver.findElement(binarySearchTrees);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	
	public void verifyimplementationBst() {

		WebElement element = driver.findElement(implementationBst);
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
	
