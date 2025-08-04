package week3.day1_home;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 2, 8, 6, 7 };
		// sort the array
		Arrays.sort(arr);
		// loop to find missing element
		for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
			int expectedindex = i - arr[0];
			if (arr[expectedindex] != i) {
				System.out.println("Missing element is: " + i);
				break;

			}

		}

	}
}
