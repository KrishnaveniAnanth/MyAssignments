package week3.day2_home;
//hybrid inheritance

//RadioButton subclass of Button subclass

public class RadioButton extends Button {
	// method
	public void selectRadioButton() {
		System.out.println("Radio button is selected");

	}

	public static void main(String[] args) {
		RadioButton select = new RadioButton();
		// calling method
		select.selectRadioButton();

	}

}
