package week3.day2_home;

//Hybrid inheritance
//execution subclass of button subclass
public class Execution extends Button {

	public static void main(String[] args) {
		// creating object
		Execution element = new Execution();
		// calling methods of WebElement superclass and button subclass
		element.click();
		element.setText("All set");
		element.submit();

	}

}
