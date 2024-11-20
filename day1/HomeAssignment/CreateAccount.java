package week2.day1.HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		//creating object for webdriver
		ChromeDriver driver = new ChromeDriver();
		//get into url
		driver.get("http://leaftaps.com/opentaps/");
		//maximizing the browser 
		driver.manage().window().maximize();
		//using implicit wait to maintain the process
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//using id locator to find Username and Password textboxs to pass the value
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//using class locator to find Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//using linktext to find element
		driver.findElement(By.linkText("CRM/SFA")).click();
		//using partial text to find element
		driver.findElement(By.partialLinkText("Acc")).click();
		//using linktext to find Create Account
		driver.findElement(By.linkText("Create Account")).click();
		//using basic locators to find elements
		driver.findElement(By.id("accountName")).sendKeys("Kasthuri K M");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//finding Number of Employees
		driver.findElement(By.name("numberEmployees")).sendKeys("2");
		//finding officeSitename
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		//finding and clicking the create account button
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}
