package exercise3;

import java.util.Scanner;

public class AcceptAndSum10Numbers {

	public static void main(String[] args) {
		
		int sum = 0; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		for (int i = 0; i < 10; i++) {
			sum = sum + scanner.nextInt();
		}
		System.out.println("Sum is " + sum + " and average is " + sum/10);
		scanner.close();
		
	}

}
