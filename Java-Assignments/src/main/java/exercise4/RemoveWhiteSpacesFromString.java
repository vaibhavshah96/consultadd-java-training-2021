package exercise4;

import java.util.Scanner;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String str = scanner.nextLine();
		
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);
		scanner.close();
	}

}
