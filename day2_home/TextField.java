package week3.day2_home;
//TextField subclass of WebElement Superclass

public class TextField extends WebElement {
	// method
	public void getText() {
		System.out.println("Got the text");
	}

	public static void main(String[] args) {
		TextField t = new TextField();
		// calling methods
		t.getText();
		t.click();
	}

}
