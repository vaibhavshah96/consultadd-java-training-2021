package exercise3;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Integer i = scanner.nextInt();
		
		Integer n = 1;
		
		while (n <= i) {
			System.out.print(n + " ");
			n++;
		}
		
		System.out.println("\nSum of first n natural numbers: " + (i*(i+1)/2));
		
		scanner.close();

	}

}
