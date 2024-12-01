package week3.week3day2HomeAssignmentList;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) throws InterruptedException {
		//launching url
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//- In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.name("searchVal")).sendKeys(Keys.ENTER);
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		Thread.sleep(3000);
		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(),'Fashion')]")).click();
		//count of the items found
		Thread.sleep(3000);
		String count = driver.findElement(By.xpath("//div[@class='filter']//strong")).getText();
		System.out.println("Count of the items found: "+count);
		//- Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		int size = brand.size();
		System.out.println("Total number of brands: "+size+"\nList of brand of the products:");
		for(int i=0;i<size;i++)
		{
			System.out.print(brand.get(i).getText()+",");
		}
		//Get the list of names of the bags and print it
		List<WebElement> bagname = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("\nThe list of name of the bags: ");
		for(int j=0;j<bagname.size();j++)
		{
			System.out.println(j+1+". "+bagname.get(j).getText());
		}
		//closing browser
		driver.quit();
	}

}
