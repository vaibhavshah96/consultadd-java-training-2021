package exercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class NonRecurringLetters {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter string: ");
		String str = scanner.nextLine();
		System.out.println(isRecurring(str));

		scanner.close();

	}

	private static boolean isRecurring(String str) {
		boolean duplicate = false;
		ArrayList<Character> list = new ArrayList<Character>(str.length());
		for (Character c : str.toCharArray()) {
			if (list.contains(c)) {
				duplicate = true;
				break;
			} else {
				list.add(c);
			}
		}

		return duplicate;
	}

}
