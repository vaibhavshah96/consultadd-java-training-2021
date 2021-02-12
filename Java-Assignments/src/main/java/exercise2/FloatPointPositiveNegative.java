package exercise2;

import java.util.Scanner;

public class FloatPointPositiveNegative {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		float i = scanner.nextFloat();
		
		if (i < 0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Positive");
		}
		
		if(Math.abs(i) < 1) {
			System.out.println("Small");
		}
		else if (Math.abs(i) > 1000000) {
			System.out.println("Large");
		}
		
		scanner.close();

	}

}
