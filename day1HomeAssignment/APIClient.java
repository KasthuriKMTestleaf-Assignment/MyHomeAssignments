package week3.day1HomeAssignment;

public class APIClient {
	//implementing method overloading
	public void sendRequest(String endPoint)
	{
		System.out.println("The endpoint is: "+endPoint);
	}
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus)
	{
		System.out.println("The endpoint is: "+endPoint+" and requestBody is: "+requestBody+" and the status is: "+requestStatus);
	}
	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("AA");
		api.sendRequest("AB", "BB", false);
	}

}
