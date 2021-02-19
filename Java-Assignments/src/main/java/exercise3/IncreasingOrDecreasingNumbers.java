package exercise3;

import java.util.Scanner;

public class IncreasingOrDecreasingNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number one: ");
		int num1 = scanner.nextInt();
		System.out.print("\nEnter number two: ");
		int num2 = scanner.nextInt();
		System.out.print("\nEnter number three: ");
		int num3 = scanner.nextInt();

		System.out.println(compareNumbers(num1, num2, num3));

		scanner.close();

	}

	private static String compareNumbers(int num1, int num2, int num3) {
		String result = "Neither increasing or decreasing";

		if (num1 > num2) {
			if (num2 > num3) {
				result = "Decreasing";
			}
		} else if (num1 < num2) {
			if (num2 < num3) {
				result = "Increasing";
			}
		}
		return result;
	}
}
