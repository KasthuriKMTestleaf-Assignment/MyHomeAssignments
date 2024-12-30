package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPage enterUname()
	{
		try {
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		} catch (Exception e) {
			System.out.println(e);
		}
		return this;
	}
	
	public LoginPage enterpwd()
	{
		try {
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		} catch (Exception e) {
			System.out.println(e);
		}
		return this;
	}
	
	public WelcomePage login()
	{
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
		} catch (Exception e) {
			System.out.println(e);
		}
		return new WelcomePage(driver);
	}
	
}
