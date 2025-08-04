package week3.day1_home;

public class FindOccurance {

	public static void main(String[] args) {
		//initializing and declaring variables
		String input = "TestLeaf";
		int count = 0;
		// convert string to character array
		char[] charArray = input.toCharArray();
		// loop to find occurence of 'e' element
		for (int i = 0; i < charArray.length; i++) {
			char targetCharacter = charArray[i];
			if (targetCharacter == 'e') {
				count++;
			}

		}
		System.out.println("Character e occured " + count + " times");

	}
}