package week3.day1_home;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";

		// Convert the string to a character array
		char[] charArray = test.toCharArray();

		// Loop to find odd index
		for (int i = 0; i < charArray.length; i++) {
			// Check if index is odd
			if (i % 2 != 0) {
				// Convert to uppercase
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}

		// Change the modified character array to a string
		String result = new String(charArray);
		System.out.println("Expected Output is: " + result);
	}
}
