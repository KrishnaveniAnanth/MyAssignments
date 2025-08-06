package week3.day2_home;

public class ReverseOddWords {

	public static void main(String[] args) {
		// declaring variable
		String test = "I am a software tester";

		// Split the string into words and have it in an array
		String[] split = test.split(" ");
		//iterate through the words in string array
		for (int i = 0; i < split.length; i++) {
			// check odd index
			if (i % 2 != 0) {
				// convert odd words into character array
				char[] charArray = split[i].toCharArray();
				//iterate through the characters in character array
				for (int j = charArray.length - 1; j >= 0; j--) {
					// print the charArray in reverse order
					System.out.print(charArray[j]);
				}
			} else {
				// if even,print the split array
				System.out.print(split[i]);
			}
			// add spaces
			System.out.print(" ");
		}

	}

}
