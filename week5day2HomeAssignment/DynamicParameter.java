package week5.week5day2HomeAssignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameter extends ProjectSpecificMethod{
	@DataProvider(name="getData")
	public String[][] getData() throws IOException
	{
		
		return ReadValueFromExcel.readExcel();
		
	}
	
	@Test (dataProvider="getData")
	public void dynamicPara(String name) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		obj.click(save).perform();
		String entityName = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		System.out.println("The entered Legal entity is : "+entityName);
	}

}
