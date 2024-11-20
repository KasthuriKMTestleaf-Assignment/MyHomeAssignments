package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//redirecting to facebook
		driver.get("https://www.facebook.com/");
		//maximizing the window
		driver.manage().window().maximize();
		//passing value for username
		WebElement facebook = driver.findElement(By.id("email"));
		facebook.sendKeys("testleaf.2023@gmail.com");
		Thread.sleep(3000);
		facebook.clear();
		facebook.sendKeys("maheskasthuri@gmail.com");
		//passing value for password
		driver.findElement(By.id("pass")).sendKeys(("Oned@yf0rme"));
		//clicking login button
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(6000);
		//closing the browser
		driver.close();
	}

}
