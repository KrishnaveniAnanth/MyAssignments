package week3.day2_home;

//Polymorphism--method overriding
//Super class
public class BasePage {

	// method1
	public void findElement() {
		System.out.println("Element was found");
	}

	// method2
	public void clickElement() {
		System.out.println("Click the element");
	}

	// method3
	public void enterText() {
		System.out.println("Enter the text");
	}

	// method4
	public void performCommonTasks() {
		System.out.println("Perform the common tasks");
	}

	public static void main(String[] args) {
		BasePage element = new BasePage();
		// calling all the methods
		element.findElement();
		element.clickElement();
		element.enterText();
		element.performCommonTasks();

	}

}
