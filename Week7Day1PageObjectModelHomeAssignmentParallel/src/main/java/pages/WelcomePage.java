package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods{
	

	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public MyHomePage crmSFA()
	{
		try {
			driver.findElement(By.linkText("CRM/SFA")).click();
		} catch (Exception e) {
			System.out.println(e);
		}
		return new MyHomePage(driver);
	}
	
	public LoginPage logout()
	{
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
		} catch (Exception e) {
			System.out.println(e);
		}
		return new LoginPage(driver);
	}

}
