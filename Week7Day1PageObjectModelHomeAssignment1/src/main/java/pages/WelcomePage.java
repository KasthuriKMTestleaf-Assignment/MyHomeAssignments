package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods{
	

	public MyHomePage crmSFA()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
	
	public LoginPage logout()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
	}

}
