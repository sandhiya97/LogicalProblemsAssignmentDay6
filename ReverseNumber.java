package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {

		int reversed = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number that needs to be reversed: ");
		int num = sc.nextInt();

		// run loop until num becomes 0
		while (num != 0) {

			// get last digit from num
			int digit = num % 10;
			reversed = reversed * 10 + digit;

			// remove the last digit from num
			num /= 10;
		}

		System.out.println("Reversed Number: " + reversed);
	}
}
