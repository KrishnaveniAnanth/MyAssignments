package week3.day2_home;

//Hybrid Inheritance
//Super class
public class WebElement {
	//method1
	public void click() {
		System.out.println("click the element");
	}
    //method2
	public String setText(String text){
		System.out.println("Text is set as "+text);
		return text;
	}
  
	public static void main(String[] args) {
		//creating object
		WebElement element = new WebElement();
		//calling methods
		element.click();
		element.setText("All set");
	}

}
