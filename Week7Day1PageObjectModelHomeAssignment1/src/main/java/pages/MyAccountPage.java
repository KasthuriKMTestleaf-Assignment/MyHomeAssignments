package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyAccountPage extends ProjectSpecificMethods{

	

	public CreateAccountPage clickCreateAccount()
	{
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
	}
}
