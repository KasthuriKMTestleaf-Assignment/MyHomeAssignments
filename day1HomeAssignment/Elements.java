package week3.day1HomeAssignment;

public class Elements extends Button{

	public static void main(String[] args) {
		Elements ele = new Elements();
		CheckBoxButton cbb = new CheckBoxButton();
		RadioButton rb = new RadioButton();
		ele.click();
		ele.setText("Buttons");
		ele.submit();
		cbb.clickCheckButton();
		rb.selectRadioButton();
		
	}

}
