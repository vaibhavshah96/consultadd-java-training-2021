package exercise4;

import java.util.Scanner;
import java.util.function.Consumer;

public class ShortestWordInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String input = sc.nextLine();
		minimumWithArrayMethod.accept(input.split(" "));
		
		sc.close();

	}

	static Consumer<String[]> minimumWithArrayMethod = sp -> {
		int minimum = (int) Float.MAX_VALUE;

		for (int i = 0; i < sp.length; i++) {
			minimum = Math.min(minimum, sp[i].length());
		}
		System.out.println("Minimum length is " + minimum);
	};

}
