package week3.week3day2HomeAssignment3A;

public class JavaConnection implements DatabaseConnection{

	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}

	@Override
	public void connect() {
		System.out.println("Connected from abstract class");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from abstract class");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Got updated");
		
	}

}
