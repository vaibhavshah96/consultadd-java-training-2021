package exercise1;

import java.util.Scanner;

public class TwoNumberAddThirty {

	public static void main(String[] args) {
		
		System.out.println("Enter two numbers between 1-10: ");
		Scanner scanner = new Scanner(System.in);
		int i1 = scanner.nextInt();
		int i2 = scanner.nextInt();
		
		if ((i1 < 1 && i2 < 1) && (i1 > 10 && i2 > 10) ) {
			scanner.close();
			throw new IllegalStateException("Enter valid input");
			
		}
		int z = i1+i2;
		int result = z+30;
		System.out.println("Result: " + result);
		scanner.close();

	}

}
