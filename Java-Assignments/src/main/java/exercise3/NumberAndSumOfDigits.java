package exercise3;

import java.util.Scanner;

public class NumberAndSumOfDigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		Long number = scanner.nextLong();
		Long sum = 0l;
		int count = 0;

		while (number != 0) {
			sum = (sum) + (number % 10);
			number = number / 10;
			count++;
		}

		System.out.println("Number of digits:  " + count + "\nSum of digits: " + sum);
		scanner.close();

	}

}
