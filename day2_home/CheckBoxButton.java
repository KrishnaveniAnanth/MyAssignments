package week3.day2_home;

//hybrid inheritance
//CheckBoxButton subclass of Button subclass
public class CheckBoxButton extends Button {
	// method
	public void clickCheckButton() {
		System.out.println("Check button is clicked");

	}

	public static void main(String[] args) {
		CheckBoxButton click = new CheckBoxButton();
		// calling method
		click.clickCheckButton();

	}

}