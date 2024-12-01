package week3.day1HomeAssignment;

public class TextField extends WebElement{
	public void getText()
	{
		System.out.println("I am going to set the value in setText method");
		super.setText("Buddy");
	}
	public static void main(String[] args) {
		TextField tf = new TextField();
		tf.getText();
		tf.setText("hello");
		tf.click();
	}
}
