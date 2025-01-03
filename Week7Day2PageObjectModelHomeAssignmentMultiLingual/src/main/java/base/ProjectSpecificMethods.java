package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import util.ReadValueFromExcel;


public class ProjectSpecificMethods {
	public ChromeDriver driver;
	public String dataFile;
	public static FileInputStream fis;	
	public static Properties pro;
	
	@BeforeMethod
	public void preCondition() throws IOException
	{
		fis = new FileInputStream("src/main/resources/English.properties");
		pro = new Properties();
		pro.load(fis);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}
	
	@DataProvider(name="getdata")
	public String[][] fetchData() throws IOException{
		return ReadValueFromExcel.readValue(dataFile);
		
	}

}
