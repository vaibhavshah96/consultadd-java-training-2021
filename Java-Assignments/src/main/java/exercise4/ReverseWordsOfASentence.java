package exercise4;

import java.util.Scanner;

public class ReverseWordsOfASentence {

	private static StringBuilder resString = new StringBuilder();

	private static void stringReverse(String string) {
		int j = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				resString.insert(j, string.charAt(i));
			} else {
				j = i + 1;
				resString.append(' ');
			}
		}
		System.out.println(resString);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter sentence: ");
		String string = scanner.nextLine();

		stringReverse(string);

		scanner.close();
	}

}
