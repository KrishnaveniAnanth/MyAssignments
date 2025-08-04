package week3.day1_home;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// declaring variables
		String text1 = "stops";
		String text2 = "potss";

		// Check if lengths are equal
		if (text1.length() == text2.length()) {
			System.out.println("Length matches");

		} else {
			System.out.println(("Length mismatch and not an anagram"));
			return;

		}

		// Convert strings to character arrays
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();

		// Sort arrays
		Arrays.sort(charArray);
		Arrays.sort(charArray2);

		// compare sorted arrays
		if (Arrays.equals(charArray, charArray2)) {
			System.out.println("The given strings are Anagram");
		} else {
			System.out.println("The given strings are not an Anagram");
		}

	}

}
