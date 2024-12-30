package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_002_LogoutPage extends ProjectSpecificMethods{
	@Test
	public void logout()
	{
		LoginPage lo = new LoginPage(driver);
		lo.enterUname().enterpwd().login().logout();
	}

}
