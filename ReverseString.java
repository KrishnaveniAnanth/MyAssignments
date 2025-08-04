package week3.day1_home;

public class ReverseString {

	public static void main(String[] args) {
		String companyName = "TestLeaf";

		// Convert the String into a character array
		char[] charArray = companyName.toCharArray();
		System.out.print("Reversed string is ");

		// Loop to reverse the string
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
