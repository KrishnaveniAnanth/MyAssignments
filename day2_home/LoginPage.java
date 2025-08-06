package week3.day2_home;

//Polymorphism--method overriding
//LoginPage subclass of superclass BasePage

public class LoginPage extends BasePage {
	@Override
	public void performCommonTasks() {
		super.performCommonTasks();
		System.out.println("Perform login page tasks");
	}

    //main method to demonstrate overriding method
	public static void main(String[] args) {
		LoginPage element=new LoginPage();
		//calling methods 
		element.performCommonTasks();
		
	}

}
