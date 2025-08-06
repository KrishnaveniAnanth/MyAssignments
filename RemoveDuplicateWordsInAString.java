package week3.day2_home;

public class RemoveDuplicateWordsInAString {

	public static void main(String[] args) {
		//initializing and declaring variables
		String text = "We learn Java basics as part of java sessions in java week1";
		int count = 0;

		// Split text into words using space
		String[] split = text.split(" ");

		//Compare each word in the text with every other word in the text
		for (int i = 0; i < split.length; i++) {
			for (int j = i + 1; j < split.length; j++) {
				if (split[i].equalsIgnoreCase(split[j]) && !split[i].equals("")) {
					// Replace duplicate with empty string
					split[j] = "";
					count++;
				}
			}
		}

		// Print result if duplicate words found
		if (count > 0) {
			System.out.print("Expected output is: ");
			for (int i = 0; i < split.length; i++) {
				if (!split[i].equals("")) {
					System.out.print(split[i] + " ");
				}
			}
			System.out.println("\nDuplicate words removed: " + count);
		} else {
			System.out.println("No duplicates found.");
		}
	}
}