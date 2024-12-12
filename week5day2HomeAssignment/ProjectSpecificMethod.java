package week5.week5day2HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	Actions obj;
	@Parameters({"url","uname","pwd"})
	
	@BeforeMethod
	public void preCondition(String url, String username, String password) throws InterruptedException {
				
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		Thread.sleep(2000);
		WebElement legalEntities = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		driver.executeScript("arguments[0].click()", legalEntities);
		Thread.sleep(2000);
		obj = new Actions(driver);
		WebElement entity = driver.findElement(By.xpath("(//*[name()='svg' and @data-key='chevrondown']//*[local-name()='path'])[6]"));
		
		obj.click(entity).perform();
		Thread.sleep(2000);
		WebElement newLegal = driver.findElement(By.xpath("//span[contains(text(),'New Legal')]"));
		driver.executeScript("arguments[0].click()", newLegal);
		
		

	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}

}
