package week3.week3day2HomeAssignment3B;

public class JavaConnection extends MySqlConnection{

	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		//calling methods
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
	}

	@Override
	public void connect() {
		System.out.println("Connected from Interface");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from abstract class");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Got updated");
		
	}

	@Override
	void executeQuery() {
		System.out.println("Executed Query");
		
	}

}
