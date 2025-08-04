package week3.day1_home;

public class FindMatchingElement {

	// compare two arrays and print matching elements
	public static void main(String[] args) {
		int array1[] = { 3, 2, 11, 4, 6, 7 };
		int array2[] = { 1, 2, 8, 4, 9, 7 };
		System.out.println("Matching elements are");
		//Iterate through each element in array1
		for (int i = 0; i < array1.length; i++) {
			//Iterate through each element in array2
			for (int j = 0; j < array2.length; j++) {
				// Compare and print if they match
				if (array1[i] == array2[j]) {
					System.out.println(array1[i]);

				}
			}

		}

	}
}
