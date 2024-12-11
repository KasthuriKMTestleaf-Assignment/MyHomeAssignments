package week5.week5day1HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase1 extends ProjectSpecificMethod{
	@Test

	public void testcase1(){
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Kasthuri K M");
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		obj.click(save).perform();
		String entityName = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		System.out.println("The entered Legal entity is : "+entityName);
		

	}

}
