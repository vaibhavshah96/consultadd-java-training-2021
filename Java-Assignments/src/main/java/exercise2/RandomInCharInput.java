package exercise2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RandomInCharInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter char: ");
		 char c = scanner.next().charAt(0);
		 
		 System.out.println(Pattern.matches("[randomRANDOM]", ""+c));
		 
		 scanner.close();
	}

}
