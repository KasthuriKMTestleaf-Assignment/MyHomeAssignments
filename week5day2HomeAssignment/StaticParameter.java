package week5.week5day2HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StaticParameter extends ProjectSpecificMethod{
	
	@Test
	public void paraStatic() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		WebElement status = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input')]"));
		obj.click(status).sendKeys(Keys.ARROW_DOWN).perform();
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		obj.click(save).perform();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//div[@part='help-text'])[3]")).getText();
		
		System.out.println(text);
		
	}

}
