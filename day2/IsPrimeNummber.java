package week1.day2;

public class IsPrimeNummber {

	public static void main(String args[]) {
		int num = 29;
		boolean prime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
			}
		}
		if (prime == true) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");
		}

	}
}
