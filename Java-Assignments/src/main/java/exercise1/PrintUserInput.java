package exercise1;

import java.util.Scanner;

public class PrintUserInput {

	public static void main(String[] args) {
		System.out.println("Enter your values: ");
		Scanner s = new Scanner(System.in);
		String string = "";
		
		string = string + s.nextLine();
		
		
		System.out.println("You entered: " + string);
		
		s.close();

	}

}
