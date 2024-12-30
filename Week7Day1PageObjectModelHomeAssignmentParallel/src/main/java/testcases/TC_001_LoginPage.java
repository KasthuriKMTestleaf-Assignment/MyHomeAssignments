package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_001_LoginPage extends ProjectSpecificMethods{
	
	@Test
	public void login()
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterUname().enterpwd().login();
	}
	
	

}
