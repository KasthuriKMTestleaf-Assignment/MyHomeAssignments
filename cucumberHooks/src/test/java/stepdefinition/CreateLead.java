package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	@When ("Click on LogIn button with {string} and {string}")
	public void enterCredentials(String uname, String pwd)
	{
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When ("Click on Login")
	public void Login()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When ("Click on CRMSFA")
	public void clickCRM()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@When ("Click on Accounts tab")
	public void clickAccount()
	{
		driver.findElement(By.linkText("Accounts")).click();
	}
	
	@When ("Click on Create Account tab")
	public void createAccount()
	{
		driver.findElement(By.linkText("Create Account")).click();
	}
	
	@When ("Enter {string} as account name")
	public void enterAccName(String accName)
	{
		driver.findElement(By.id("accountName")).sendKeys(accName);
	}
	
	@When ("Click on Create Account button")
	public void createButton()
	{
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	@Then ("Verify Account name {string}")
	public void verifyAcc(String accnamed)
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//table[@class='fourColumnForm']/tbody/tr/td[2]/span)[1]")));
		String accountName = driver.findElement(By.xpath("(//table[@class='fourColumnForm']/tbody/tr/td[2]/span)[1]")).getText();
		if(accountName.contains(accnamed))
		{
			System.out.println("Yes, my account got created");
		}
		else
		{
			System.out.println("Oops, my account not created");
		}
	}

}
