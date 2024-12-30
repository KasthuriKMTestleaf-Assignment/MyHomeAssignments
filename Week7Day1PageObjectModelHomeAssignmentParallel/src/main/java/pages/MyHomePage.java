package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public MyAccountPage clickAccountTab()
	{
		try {
			driver.findElement(By.linkText("Accounts")).click();
		} catch (Exception e) {
			System.out.println(e);
		}
		return new MyAccountPage(driver);
	}
	
	
}
