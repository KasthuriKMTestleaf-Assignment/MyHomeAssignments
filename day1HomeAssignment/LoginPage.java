package week3.day1HomeAssignment;

public class LoginPage extends BasePage{
	

	@Override
	public void performCommonTasks() {
		System.out.println("Method Override");
		//super.performCommonTasks();
	}

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		BasePage bp = new BasePage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
		bp.performCommonTasks();
	}

}
