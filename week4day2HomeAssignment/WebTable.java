package week4.week4day2HomeAssignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		//initialize web browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://finance.yahoo.com/");
		//mouse hover on more to view Crypto tab
		WebElement more = driver.findElement(By.xpath("//span[text()='More']"));
		Actions obj = new Actions(driver);
		obj.moveToElement(more).perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Crypto")).click();
		
		System.out.println("The crypto names are:");
		for(int i=1;i<=25;i++) 
		{ 
			String name = driver.findElement(By.xpath("(//table[@data-testid='table-container']/tbody/tr/td[2]/span/div)["+i+"]")).getText();  
			System.out.println(name); 
		}
		driver.quit();
	}
}