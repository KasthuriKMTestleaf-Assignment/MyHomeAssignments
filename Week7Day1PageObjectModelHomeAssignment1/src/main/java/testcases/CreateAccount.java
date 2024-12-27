package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateAccount extends ProjectSpecificMethods{
	
	@Test
	public void createAcc()
	{
		LoginPage lp = new LoginPage();
		lp.enterUname().enterpwd().login().crmSFA().clickAccountTab().clickCreateAccount()
		.enterAccountName().selectOwnership().clickCreateAccButton();
	}

}
