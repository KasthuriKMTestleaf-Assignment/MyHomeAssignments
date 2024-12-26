package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificMethod;
import base.ProjectSpecificMethodDynamicParameter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeAssignmentStepDef extends ProjectSpecificMethodDynamicParameter {
	//public ChromeDriver driver;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	Actions obj = new Actions(driver);
	@When("Click on LogIn button with {string} and {string}")
	public void click_on_log_in_button_with_and(String uname, String pwd) {
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
	}

	@When("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {
	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@When("Click view All and click Sales from App Launcher")
	public void click_view_all_and_click_sales_from_app_launcher() {
		WebElement viewAll = driver.findElement(By.xpath("//button[@aria-label='View All Applications']"));
		wait.until(ExpectedConditions.visibilityOf(viewAll));
	    viewAll.click();
	    WebElement sales = driver.findElement(By.xpath("//p[text()='Sales']"));
	    wait.until(ExpectedConditions.visibilityOf(sales));
	    sales.click();
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() {
	    WebElement element = driver.findElement(By.xpath("//a[@title='Accounts']/span"));
	    driver.executeScript("arguments[0].click()", element);
	}

	@When("Click on New button")
	public void click_on_new_button() {
	    driver.findElement(By.xpath("//div[@title='New']")).click();
	}

    @When("Enter {string} as account name") public void
	 enter_as_account_name(String name) {
	 driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name); }
	@When("Select Ownership as Public")
	public void select_ownership_as_public() {
	    WebElement owner = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
	    driver.executeScript("arguments[0].click()", owner);
	    wait.until(ExpectedConditions.visibilityOf(owner));
	    obj.click(owner).sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
	    //driver.findElement(By.xpath("//button[@aria-label='Ownership']")).sendKeys();
	    
	}

	@When("Click save")
	public void click_save() throws InterruptedException {
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		wait.until(ExpectedConditions.visibilityOf(save));
	    driver.executeScript("arguments[0].click()",save);
	}

	@Then("Verify Account name")
	public void verify_account_name() {
	    String text = driver.findElement(By.xpath("//slot[contains(@class,'slds-page-header__title')]/lightning-formatted-text")).getText();
	    System.out.println("The entered account name is: "+text);
	}

}
