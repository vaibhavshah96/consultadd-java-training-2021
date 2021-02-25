package exercise4;

import java.util.ArrayList;

public class BalancedBraces {

	public static void main(String[] args) {

		String str = "[66]{}[(]";
		int i = 0;
		ArrayList<Character> bracesList = new ArrayList<Character>();

		for (Character c : str.toCharArray()) {
			if (c == '[' || c == '{' || c == '(') {
				bracesList.add(c);
				i++;
			} else {
				if (c == ']') {
					if (bracesList.get(i - 1) == '[') {
						bracesList.remove(i - 1);
						i = i - 1;

					} else {
						break;
					}
				}
				if (c == ')') {
					if (bracesList.get(i - 1) == '(') {
						bracesList.remove(i - 1);
						i = i - 1;
					} else {
						break;
					}
				}
				if (c == '}') {
					if (bracesList.get(i - 1) == '{') {
						bracesList.remove(i - 1);
						i = i - 1;
					} else {
						break;
					}
				}

			}
		}

		if (bracesList.size() > 0) {
			System.out.println("Uneven Braces");
		} else {
			System.out.println("Even braces");
		}

	}

}
