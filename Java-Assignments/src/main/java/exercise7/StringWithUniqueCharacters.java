package exercise7;

import java.util.ArrayList;
import java.util.List;

public class StringWithUniqueCharacters {

	public static void main(String[] args) {

		String str = "algorithm";

		List<Character> unique = new ArrayList<Character>();
		boolean flag = true;

		for (char c : str.toCharArray()) {
			if (unique.contains(c)) {
				System.out.println("Not all unique.");
				flag = false;
				break;
			} else {
				unique.add(c);
			}
		}
		if (flag)
			System.out.println("All unique.");

	}

}
