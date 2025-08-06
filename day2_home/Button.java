package week3.day2_home;

//Hybrid inheritance
//Button subclass of superclass WebElement
public class Button extends WebElement {
	// method
	public void submit() {
		System.out.println("response is submitted");
	}

	public static void main(String[] args) {
		Button b = new Button();
		// calling methods
		b.submit();
		b.click();

	}

}
