package week2.day1.HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithDropdown {

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
				String accNameNew="Kasthuri Ram";
				driver.findElement(By.id("accountName")).sendKeys(accNameNew);
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				//using select class to choose value for Industry from dropdown
				WebElement industry= driver.findElement(By.name("industryEnumId"));
				Select industryOptions=new Select(industry);
				industryOptions.selectByVisibleText("Computer Software");
				//using SelectByVisibleText
				WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
				Select ownershipOptions = new Select(ownership);
				ownershipOptions.selectByVisibleText("S-Corporation");
				//selecting source
				WebElement source = driver.findElement(By.id("dataSourceId"));
				Select sourceOptions = new Select(source);
				sourceOptions.selectByValue("LEAD_EMPLOYEE");
				//selecting marketing campaign
				WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
				Select marketingOptions = new Select(marketing);
				marketingOptions.selectByIndex(5);
				//selecting state
				WebElement state = driver .findElement(By.name("generalStateProvinceGeoId"));
				Select stateoptions = new Select(state);
				stateoptions.selectByValue("TX");
				//click create account button
				driver.findElement(By.className("smallSubmit")).click();
				//Verifying account name
				String accName = driver.findElement(By.xpath("//span[contains(text(),'Kas')]")).getText();
				//checking account is correct or not
				if(accName.contains(accNameNew))
				{
					System.out.println("The given account name is displayed correctly");
				}
				else
				{
					System.out.println("Wrond account name");
				}
				
				//closing browser
				driver.close();

	}

}
