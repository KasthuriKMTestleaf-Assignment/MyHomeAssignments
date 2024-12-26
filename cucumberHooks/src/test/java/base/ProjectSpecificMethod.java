package base;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests{
	//public static for handle NullPointer Exception
	public static ChromeDriver driver;
}
