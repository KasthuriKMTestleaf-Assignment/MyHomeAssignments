package week4.week4day1HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndAlertAutomation {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//switching into frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		String enterName ="Kasthuri Ramkumar";
		alert.sendKeys(enterName);
		alert.accept();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		String expectedText = "Hello "+enterName+"! How are you today?";
		if(text.equals(expectedText))
		{
			System.out.println("The texts are same");
		}
		else
		{
			System.out.println("The texts are not same");
		}
		driver.quit();
	}

}
