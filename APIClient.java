package week3.day2_home;

//Polymorphism--Method Overloading
public class APIClient {
	// overloaded method which accepts one argument
	public void sendRequest(String endpoint) {
		System.out.println("Request sent to " + endpoint);
		System.out.println("------------");
	}

	// overloaded method which accepts three arguments
	public void sendRequest(String endpoint, String requestbody, boolean requeststatus) {
		System.out.println("Request sent to " + endpoint);
		System.out.println("Request body is " + requestbody);
		if (requeststatus) {
			System.out.println("Request sent successfully");
		} else {
			System.out.println("Request failed");

		}
	}

	// main method to demonstrate the usage of the overloaded sendRequest method
	public static void main(String[] args) {
		APIClient client = new APIClient();
		// calling overloaded methods
		client.sendRequest("client");
		client.sendRequest("client1", "client1 details", true);

	}

}
