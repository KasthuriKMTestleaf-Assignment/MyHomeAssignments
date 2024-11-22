package week2.day2.HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String leadIDEntered="17500";
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		WebElement findLead = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLead.click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Pho')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9487427357");
		WebElement findLeads= driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeads.click(); 
		String leadID = driver.findElement(By.xpath("//a[text()='17500']")).getText();
		System.out.println("The Lead ID is: "+leadID);
		driver.findElement(By.xpath("//a[text()='17500']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
		String display = driver.findElement(By.xpath("//div[text()='No records to display']")).getText(); 
		if(display.contentEquals("No records to display")) {
			System.out.println("Yes, no records to display"); }
		    driver.close();
	}

}
