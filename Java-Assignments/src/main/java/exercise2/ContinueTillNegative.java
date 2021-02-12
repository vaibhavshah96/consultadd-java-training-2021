package exercise2;

import java.util.Scanner;

public class ContinueTillNegative {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a number: ");
		
		while (scanner.nextLong() >= 0) {
			System.out.println("Good Going");
		}
		System.out.println("It's Over");
		scanner.close();

	}

}
