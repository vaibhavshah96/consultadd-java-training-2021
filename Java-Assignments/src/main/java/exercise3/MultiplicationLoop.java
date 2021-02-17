package exercise3;

import java.util.Scanner;

public class MultiplicationLoop {
	
	

	public static void main(String[] args) {
		System.out.println("This program multiples a number till 15 press y to continue or enter n to enter your number");
		Scanner scanner = new Scanner (System.in);
		int i = 0;
		
		char c = scanner.next().charAt(0);
		
		
		if (c == 'y') {
			System.out.println("Y loop");
			i = 15;
		}
		else if (c == 'n') {
			System.out.println("Enter number of multiples");
			i = scanner.nextInt();
		}
		
		
		System.out.println("Enter your number: ");
		
		int number = scanner.nextInt();
		
		
		for (int j = 1; j <= i; j++) {
			System.out.println(j + "*" + number + "=" + j*number);
		}
		
		scanner.close();
		

	}

}
