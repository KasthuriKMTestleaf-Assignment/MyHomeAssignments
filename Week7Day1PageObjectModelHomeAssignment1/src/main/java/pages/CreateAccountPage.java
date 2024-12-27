package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.ProjectSpecificMethods;

public class CreateAccountPage extends ProjectSpecificMethods{
	
	public CreateAccountPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public CreateAccountPage enterAccountName()
	{
		driver.findElement(By.id("accountName")).sendKeys("DEF");
		return this;
	}
	
	public CreateAccountPage selectOwnership()
	{
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		obj.sendKeys(ownership, "S-Corporation").perform();
		return this;
		
	}
	
	public ViewAccountPage clickCreateAccButton()
	{
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		return new ViewAccountPage(driver);
	}
}
