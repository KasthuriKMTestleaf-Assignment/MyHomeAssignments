package week3.day1HomeAssignment;

public class LoginTestData extends TestData{

	public void enterUsername(String uname)
	{
		System.out.println("Enter username: "+uname);
	}
	
	public void enterPassword(String pwd)
	{
		System.out.println("Password: "+pwd);
	}
	public static void main(String[] args) {
		LoginTestData ltd = new LoginTestData();
		ltd.enterCredentials();
		ltd.enterUsername("Kasthuri");
		ltd.enterPassword("Ramkumar");
		ltd.navigateToHomePage();
	}

}
