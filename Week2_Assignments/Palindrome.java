package week2.day1_Assignments;

public class Palindrome {

	public static void main(String[] args) {
		// initializing variables
		int input = 1331;
		int originalvalue = input;
		int output = 0;
        //Loop to reverse the number
		for (int i = input; i > 0; i = i / 10) {
			int remainder = i % 10;
			output = (output * 10) + remainder;

		}
		//compare and print result
		if (originalvalue == output) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

}
