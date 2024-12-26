package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends ProjectSpecificMethod{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	public String totalNoRecord;
	@When ("Click on Find Account tab")
	public void findAcc()
	{
		driver.findElement(By.linkText("Find Accounts")).click();
	}
	@When ("Enter {string} in field account name")
	public void delename(String delname)
	{
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys(delname);
	}
	
	@When ("Click on Find Account button")
	public void clickFindButton()
	{
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	}
	
	/*
	 * @Then("Verify accounts are present {string}") public void
	 * verify_accounts_are_present(String name) throws InterruptedException {
	 * Thread.sleep(2000); String records =
	 * driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	 * totalNoRecord=records; if(!totalNoRecord.contains("No record")) {
	 * List<WebElement> elements = driver.findElements(By.xpath(
	 * "//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a")); int size =
	 * elements.size(); System.out.println(size); for(int i=0;i<size;i++) {
	 * WebElement recordname = driver.findElement(By.xpath(
	 * "//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a)["+i+1+"]"));
	 * String text = recordname.getText(); if(text.contentEquals(name)) {
	 * System.out.println("same"); }
	 * 
	 * } } }
	 */
	
	@When ("Click on first row to select account")
	public void select()
	{
		try {
		    driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a")).click();
		} catch (StaleElementReferenceException e) {
		    WebElement element = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a"));
		    element.click();
		}
	}
	@When ("Click on Deactivate Account")
	public void deactive()
	{
		driver.findElement(By.className("subMenuButtonDangerous")).click();
	}
	@When ("Click ok on Alert window")
	public void alert()
	{
		//alert handling
		Alert alert = driver.switchTo().alert();
		//accepting alert
		alert.accept();
	}
	@Then ("Verify the account deactivate message")
	public void verifyDelete()
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("subSectionWarning"))));
		String deactivemsg = driver.findElement(By.className("subSectionWarning")).getText();
		if(deactivemsg.contains("deactivated"))
		{
			System.out.println("Yes, account is deactivated");
		}
		else
		{
			System.out.println("No, account is not deactivated");
		}
	}
	



}
