package exercise7;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharacterCount {

	public static void main(String[] args) {

		String str = "Hello, World!";
		HashMap<Character, Integer> frequency = new LinkedHashMap<Character, Integer>();

		for (char c : str.toCharArray()) {
			frequency.put(c, frequency.getOrDefault(c, 0) + 1);
		}

		for (Character c : frequency.keySet()) {
			System.out.println(c + ": " + frequency.get(c));
		}

	}

}
