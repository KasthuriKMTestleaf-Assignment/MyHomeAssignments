package week2.day1.HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		//finding Lead element
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kasthu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramkumar");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		String titleEnter="ML";
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(titleEnter);
		driver.findElement(By.name("submitButton")).click();
		String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		if (title.contentEquals(titleEnter))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("not same");
		}
		driver.close();

	}

}
