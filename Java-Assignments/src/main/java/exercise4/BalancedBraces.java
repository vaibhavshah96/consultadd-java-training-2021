package exercise4;

import java.util.ArrayList;
import java.util.Stack;

public class BalancedBraces {

	public static void main(String[] args) {

		String str = "[66]{}[(]";
		Stack<Character> bracesList = new Stack<Character>();

		for (Character c : str.toCharArray()) {
			if (c == '[' || c == '{' || c == '(') {
				bracesList.push(c);
				
			} else {
				if (c == ']') {
					if (bracesList.pop() != '[') {
						break;

					}
				}
				if (c == ')') {
					if (bracesList.pop() != '(') {
						break;
					}
				}
				if (c == '}') {
					if (bracesList.pop() != '{') {

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
