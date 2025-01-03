package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyAccountPage extends ProjectSpecificMethods{

	

	public MyAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateAccountPage clickCreateAccount()
	{
		try {
			driver.findElement(By.linkText(pro.getProperty("myHome.createAcc"))).click();
		} catch (Exception e) {
			System.out.println(e);
		}
		return new CreateAccountPage(driver);
	}
}
