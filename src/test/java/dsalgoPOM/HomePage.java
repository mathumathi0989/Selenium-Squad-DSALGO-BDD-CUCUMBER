package dsalgoPOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver;
	private WebDriverWait wait;

	By prepareinterviestart = By.xpath("//a[@href='/home']");
	By dataStructuresdrop = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By stackstart = By.xpath("//a[@href='stack']");
	By queuestart = By.xpath("//a[@href='queue']");
	By graphstart = By.xpath("//a[@href='graph']");
	By arraystart = By.xpath("//a[@href='array']");
	By linkedliststart = By.xpath("//a[@href='linked-list']");
	By treestart = By.xpath("//a[@href='tree']");
	By datastructurestart = By.xpath("//a[@href='data-structures-introduction']");
	By signout = By.linkText("Sign out");
	By register = By.xpath("//a[text()=' Register ']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	public void clickstart() {

		WebElement prepstart = driver.findElement(prepareinterviestart);
		prepstart.click();
	}

	public void selectDataStructuresrequired() {
		String[] dslist = { "Arrays", "Linked List", "Stack", "Queue", "Tree", "Graph" };
		for (String dsselect : dslist) {
			WebElement dropdown = wait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(dataStructuresdrop)));
			dropdown.click();
			dropdown.findElement(By.xpath("//a[normalize-space()='" + dsselect + "']")).click();

		}
	}

	public void selectDataStructuresmodule() {
		String[] ds = { "data-structures-introduction", "array", "linked-list", "stack", "queue", "tree", "graph" };

		for (String select : ds) {
			WebElement ele = driver.findElement(By.xpath("//a[@href='" + select + "']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ele);
			js.executeScript("arguments[0].click();", ele);

		}

	}

	public void selectStack() {
		driver.findElement(stackstart).click();
		System.out.println(driver.getTitle());

	}

	public void selectQueue() {
		driver.findElement(queuestart).click();
		System.out.println(driver.getTitle());

	}

	public void selectGraph() {
		driver.findElement(graphstart).click();
		System.out.println(driver.getTitle());

	}

	public void selectTree() {
		driver.findElement(treestart).click();
		System.out.println(driver.getTitle());

	}

	public void selectArray() {
		driver.findElement(arraystart).click();
		System.out.println(driver.getTitle());

	}

	public void selectLinkedList() {
		driver.findElement(linkedliststart).click();
		System.out.println(driver.getTitle());

	}

	public void selectDataStructure() {
		driver.findElement(datastructurestart).click();
		System.out.println(driver.getTitle());

	}

	public void clickSignoutButton() {
		driver.findElement(signout).click();
	}

	public void register() {
		driver.findElement(register).click();
	}

}
