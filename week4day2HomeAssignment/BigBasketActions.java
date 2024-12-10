package week4.week4day2HomeAssignment;

import java.awt.Desktop.Action;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasketActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		//initialize chromedriver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bigbasket.com/");
		//click on Shop by Category
		driver.findElement(By.xpath("(//span[text()='Shop by']//following-sibling::span)[2]")).click();
		Thread.sleep(1000);
		// Mouse over "Foodgrains, Oil & Masala"
		WebElement foodgrain = driver.findElement(By.linkText("Foodgrains, Oil & Masala"));
		Actions obj = new Actions(driver);
		obj.moveToElement(foodgrain).perform();
		Thread.sleep(2000);
		//Mouse over "Rice & Rice Products"
		WebElement rice = driver.findElement(By.linkText("Rice & Rice Products"));
		obj.moveToElement(rice).perform();
		//riceproduct.perform();
		Thread.sleep(2000);
//		Click on "Boiled & Steam Rice".
		WebElement boildrice = driver.findElement(By.linkText("Boiled & Steam Rice"));
		obj.click(boildrice).perform();
//		Filter the results by selecting the brand "bb Royal" this javascript exception will be thrown if we dont executescript
		WebElement bbRoyal = driver.findElement(By.xpath("//label[text()='BB Royal']"));
		driver.executeScript("arguments[0].click()", bbRoyal);
		// Click on "Tamil Ponni Boiled Rice".
		Thread.sleep(3000);
		WebElement bag = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
		obj.scrollToElement(bag).perform();
		bag.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		//Select the 5 Kg bag. switch to next window and scrolling down to the element
		Thread.sleep(2000);
		WebElement kg = driver.findElement(By.xpath("//span[text()='5 kg']"));
		obj.scrollToElement(kg).perform();
		kg.click();
		//Check and note the price of the rice
		String price = driver.findElement(By.xpath("//h1[text()='bb Royal Tamil Ponni Boiled Rice, 5 kg (12-17 Months Old)']/following-sibling::table/tr[1]/td[1]")).getText();
		System.out.println("The price of 5 kg is: "+price);
		//Click "Add" to add the bag to your cart
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		//Verify the success message that confirms the item was added to your cart. finding toast element message
		Thread.sleep(2000);
		WebElement toastElement = driver.findElement(By.xpath("//div[@class='self-center']/following-sibling::p"));
		String toastMessage = toastElement.getText();
        System.out.println("Toast Message: " + toastMessage);
        //snapshot
        Thread.sleep(2000);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snapshot/bigbasket.PNG");
		FileUtils.copyFile(screenshotAs, target);
		//closing current window
		driver.close();
		//switching to parent window
		driver.switchTo().window(window.get(0));
		//closing browser
		driver.quit();
}

}
