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
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage(driver);
	}
	
	
}
