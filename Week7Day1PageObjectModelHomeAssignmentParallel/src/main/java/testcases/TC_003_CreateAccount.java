package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_003_CreateAccount extends ProjectSpecificMethods {
	@Test
	public void createAcc()
	{
		LoginPage ca = new LoginPage(driver);
		ca.enterUname().enterpwd().login().crmSFA().clickAccountTab().clickCreateAccount()
		.enterAccountName().selectOwnership().clickCreateAccButton();
	}
	

}