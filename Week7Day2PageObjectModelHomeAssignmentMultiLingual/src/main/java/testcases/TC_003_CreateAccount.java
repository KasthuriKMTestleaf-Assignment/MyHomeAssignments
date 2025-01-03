package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_003_CreateAccount extends ProjectSpecificMethods {
	
	@BeforeTest
	public void  set() {
		dataFile = "CreateAccount1";
	}
	
	@Test (dataProvider="getdata")
	public void createAcc(String accName, String Owner1)
	{
		LoginPage ca = new LoginPage(driver);
		ca.enterUname().enterpwd().login().crmSFA().clickAccountTab().clickCreateAccount()
		.enterAccountName(accName).selectOwnership(Owner1).clickCreateAccButton();
	}
	

}