package pages;

import java.nio.channels.AsynchronousSocketChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.ProjectSpecificMethods;

public class CreateAccountPage extends ProjectSpecificMethods{
	
	
	
	public CreateAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateAccountPage enterAccountName(String accName)
	{
		try {
			driver.findElement(By.id("accountName")).sendKeys(accName);
		} catch (Exception e) {
			System.out.println(e);
		}
		return this;
	}
	
	public CreateAccountPage selectOwnership(String owner)
	{
		Actions obj = new Actions(driver);
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		try {
			obj.sendKeys(ownership, owner).perform();
		} catch (Exception e) {
			System.out.println(e);
		}
		return this;
		
	}
	
	public ViewAccountPage clickCreateAccButton()
	{
		try {
			driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		} catch (Exception e) {
			System.out.println(e);
			}
		return new ViewAccountPage(driver);
	}
}
