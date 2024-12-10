package week4.week4day2HomeAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		// initializing browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		// Goto Men's Fashion, mouse hovering
		WebElement menFashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions obj = new Actions(driver);
		obj.moveToElement(menFashion).perform();
		// Go to "Sports Shoes". clicking the element
		WebElement sportShoes = driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"));
		obj.click(sportShoes).perform();
		// Get the count of sports shoes
		String countOfShoes = driver
				.findElement(By.xpath("//h1[@category='Sports Shoes for Men']/following-sibling::span")).getText();
		System.out.println("The count of sports shoes: " + countOfShoes);
		// Click on "Training Shoes"
		WebElement trainingShoes = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		obj.click(trainingShoes).perform();
		// . Sort the products by "Low to High" selecting from drop down but it is not
		// options tag
		driver.findElement(By.xpath("//i[contains(@class,'sort-arrow')]")).click();
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		Thread.sleep(2000);
		/*
		 * WebElement lastproduct =
		 * driver.findElement(By.xpath("(//span[@id='pagination-total-count'])[2]"));
		 * Thread.sleep(1000); driver.switchTo().frame(lastproduct);
		 * obj.scrollToElement(lastproduct).perform(); //String pricelist =
		 * driver.findElements(By.xpath("//span[@class='lfloat product-price']")).
		 * toString(); Thread.sleep(2000); int size = pricelist.size();
		 * System.out.println(size);
		 * 
		 * List<String> price = new ArrayList<String>(); for(int i=1;i<=size;i++) {
		 * //driver.findElement(By.xpath("//span[contains(@class,'product-price')]")
		 * String pricetext =
		 * driver.findElement(By.xpath("(//span[@class='lfloat product-price'](["+i+"]")
		 * ).getText(); price.add(pricetext);
		 * //driver.findElement(By.xpath("(//span[@class='lfloat product-price'])["+i+
		 * "]")).getText() } System.out.println(price);
		 * System.out.println("The items are sorted");
		 */
		// Select any price range ex:(500-700).
		driver.switchTo().defaultContent();
		WebElement fromvalue = driver.findElement(By.name("fromVal"));
		fromvalue.clear();
		fromvalue.sendKeys("300");
		WebElement tovalue = driver.findElement(By.name("toVal"));
		tovalue.clear();
		tovalue.sendKeys("700");
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow')]")).click();
		Thread.sleep(1000);
		// Filter by any colour.
		WebElement color = driver.findElement(By.xpath("//a[contains(text(),' White & Blue')]"));
		obj.scrollToElement(color).perform();
		driver.executeScript("arguments[0].click()", color);

		// Mouse hover on the first resulting "Training Shoes".
		WebElement shoe = driver.findElement(By.xpath("//img[@title='RICKENBAC White Training Shoes']"));
		obj.moveToElement(shoe).perform();
		Thread.sleep(1000);
		// Click the "Quick View" button.
		WebElement element = driver.findElement(By.xpath("(//div[contains(@class,'center quick-view-bar')])[1]"));
		driver.executeScript("arguments[0].click()", element);
		// Print the cost and the discount percentage.
		String priceFinal = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("The price is: " + priceFinal);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The discount is :" + discount);
		// Take a snapshot of the shoes.
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snapshot/snapdeal.PNG");
		FileUtils.copyFile(screenshotAs, target);
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		driver.quit();

	}

}
