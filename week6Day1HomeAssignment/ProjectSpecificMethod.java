package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests{
	public static ChromeDriver driver;

	@BeforeMethod
	public void precondition()
	{
		driver = new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterMethod
	public void postcndition()
	{
		driver.quit();
	}
}
