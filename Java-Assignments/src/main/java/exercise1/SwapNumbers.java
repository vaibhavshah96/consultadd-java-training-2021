package exercise1;

import java.util.Scanner;

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your number: ");
		Scanner sc = new Scanner(System.in);
		
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		
		swapWithExtra(i1, i2);
		
		swapWithoutExtra(i1, i2);
		
		sc.close();
	}
	
	private static void swapWithoutExtra(int i1, int i2) {
		
		i1 = i1 + i2;
		i2 = i1 - i2;
		
		i1 = i1-i2;
		
		System.out.println("Swapped without extra: "+i1 +" "+ i2);
		
	}

	private static void swapWithExtra(int i1,int i2) {
		
		int result = i1;
		i1 = i2;
		i2 = result;
		
		System.out.println("Swapped values with extra: " + i1 + " " + i2);
		
		
	}
	

}
