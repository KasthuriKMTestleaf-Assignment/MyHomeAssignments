package week2.day1.HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("TestArjun");
		driver.findElement(By.name("lastname")).sendKeys("TestRam");
		
		WebElement date = driver.findElement(By.id("day"));
		Select objDate = new Select(date);
		objDate.selectByVisibleText("11");
		
		WebElement month = driver.findElement(By.id("month"));
		Select objMonth = new Select(month);
		objMonth.selectByValue("7");
		
		WebElement year = driver.findElement((By.id("year")));
		Select objYear = new Select(year);
		objYear.selectByVisibleText("2009");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("7736537876");
		driver.findElement(By.id("password_step_input")).sendKeys("qwertuiop");
		
		//driver.findElement(By.name("websubmit")).click();
		
	}

}
