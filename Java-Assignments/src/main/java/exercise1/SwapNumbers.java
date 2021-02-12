package exercise1;

import java.util.Scanner;

//Swap two numbers using third variable as result name and do the same task without using any third variable. 
//
//2. 	Write a program to print the value given by the user. 
//
//3. 	Write a program to complete the task given below: 
//
//Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable call z. 
//
//Use z for adding 30 into it and print the final result by using variable results. 


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
