package week3.day2_home;

//Single level Inheritance
//Superclass
public class TestData {
	//method1
	public void enterCredentials() {
		System.out.println("Credentials are entered");
	}
    //method2
	public void navigateToHomePage() {
		System.out.println("Navigated to home page");
	}

	public static void main(String[] args) {
		//creating object
		TestData input = new TestData();
		//calling methods
		input.enterCredentials();
		input.navigateToHomePage();

	}

}
