package week3.day2_home;

//Single Level Inheritance
//Subclass of Super class TestData
public class LoginTestData extends TestData {
	// method1
	public void enterUsername() {
		System.out.println("Enter the username:Krishnaveni");
	}

	// method2
	public void enterPassword() {
		System.out.println("Enter the password:*******");
	}

	public static void main(String[] args) {
		// creating object
		LoginTestData inputs = new LoginTestData();
		// calling methods from subclass and superclass
		inputs.enterUsername();
		inputs.enterPassword();
		inputs.enterCredentials();
		inputs.navigateToHomePage();

	}

}
