package exercise2;

import java.util.Scanner;

public class ConditionalActionsOnNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int i = scanner.nextInt();
		
		
		if (i < 0) {
			System.out.println("Enter a positive integer");
			System.exit(0);
		}
		
		
		if (i%2 == 1) {
			System.out.println("NEW");
		}
		else if (i >= 2 && i<= 5) {
			System.out.println("OLD");
		}
		else if (i>=6 && i<=30) {
			System.out.println("NEW");
		}
		else {
			System.out.println("OLD");
		}
		
		scanner.close();

	}

}
