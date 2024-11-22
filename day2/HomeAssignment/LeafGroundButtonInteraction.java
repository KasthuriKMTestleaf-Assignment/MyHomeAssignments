package week2.day2.HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteraction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contentEquals("dashboard"))
		{
			System.out.println("Yes, the title is dashboard");
		}
		else
		{
			System.out.println("No, the title is Dashboard");
		}
		
		driver.findElement(By.xpath("//i[contains(@class,'pi-server')]")).click();
		driver.findElement(By.xpath("//span[text()='Button']")).click();
		
		WebElement disabled = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following-sibling::button"));
		if(disabled.isEnabled())
		{
			System.out.println("Enabled");
		}
		else
		{
			System.out.println("Disabled");
		}
		
		WebElement position = driver.findElement(By.xpath("//h5[contains(text(),'position')]/following-sibling::button"));
		System.out.println("Submit button position is: "+position.getLocation());
		
		/* I dont understand cssvalue
		 * WebElement color = driver.findElement(By.
		 * xpath("//h5[contains(text(),'button color')]/following-sibling::button"));
		 * String save =
		 * driver.findElement(By.xpath("//span[text()='Save']")).getText();
		 * System.out.println("The background color of Save is: "+color.getCssValue(
		 * "Save"));
		 */
		System.out.println("The height and width of the button is: "+driver.findElement(By.xpath("//h5[contains(text(),'height')]/following-sibling::button")).getSize());
		driver.close();
	}

}
