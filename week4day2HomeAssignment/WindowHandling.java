package week4.week4day2HomeAssignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		//find element in table
		driver.findElement(By.xpath("//table[@class='twoColumnForm']/tbody/tr/td[2]/a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		//switching to child window
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("(//table[contains(@class,'row-table')]/tbody/tr/td/div/a)[1]")).click();
		//switch back to parent window
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//table[@class='twoColumnForm']/tbody/tr[2]/td[2]/a")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windows2 = new ArrayList<String>(windowHandles2);
		//switching to child window
		driver.switchTo().window(windows2.get(1));
		driver.findElement(By.xpath("(//table[contains(@class,'row-table')]/tbody/tr/td/div/a)[6]")).click();
		//switch back to parent window
		driver.switchTo().window(windows2.get(0));
		//click merge button
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		//accept the alert
		alert.accept();
		//getting window title
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
