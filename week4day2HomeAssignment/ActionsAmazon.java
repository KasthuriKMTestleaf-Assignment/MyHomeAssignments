package week4.week4day2HomeAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ActionsAmazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//searching and sending value in searchbar
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		//creating object for Actions 
		Actions obj = new Actions(driver);
		obj.click(search).perform();
		//getting first product price
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("first product price is : "+price);
        ((RemoteWebDriver) driver).resetInputState();
		//getting first product rating
		Thread.sleep(2000);
		String rating = driver.findElement(By.xpath("(//a[contains(@aria-label,'ratings')]/span)[1]")).getText();
		//driver.findElement(By.xpath("(//a[contains(@class,'a-link-normal s-underline-text s')]/span)[2]")).getText();
		if(rating.contentEquals(""))
		{
			System.out.println("no rating");
		}
		else
		{
			System.out.println("Number of customer ratings: "+rating);
		}
		//clicking first image
		driver.findElement(By.xpath("(//div[contains(@class,'a-section aok-relative')]/img)[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> mobileWindow = new ArrayList<String>(windowHandles);
		//switching into newly opened window
		driver.switchTo().window(mobileWindow.get(1));
		//snapshot
		Thread.sleep(2000);
		File mobile = driver.getScreenshotAs(OutputType.FILE);
		File mobile1 = new File("./snapshot/mobile.png");
		FileUtils.copyFile(mobile, mobile1);
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		//Alert alert = driver.switchTo().alert();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> newwindow = new ArrayList<String>(windowHandles2);
		System.out.println(newwindow.size());
		driver.switchTo().window(newwindow.get(1));
		//in this i am unable to get text of cart amount
		String cartTotal = driver.findElement(By.xpath("//div[@id='attach-accessory-pane']/div/div/div[3]/div/div[2]/div/div/span[2]/span")).getText();
		Thread.sleep(3000);
		//String cartTotal = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		System.out.println("cart total:"+cartTotal);
		driver.quit();
	}

}
