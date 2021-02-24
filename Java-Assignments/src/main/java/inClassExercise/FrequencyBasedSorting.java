package inClassExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyBasedSorting {

	public static void main(String[] args) {
		HashMap<Character, Integer> countLetter = new HashMap<Character, Integer>(); // Initialize map to character and their frequencies

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string: ");

		String str = scanner.nextLine();
		str = str.toLowerCase().replaceAll("[^a-z]", ""); // To avoid duplicate characters if user inputs capital letters or white space.

		for (Character key : str.toCharArray()) {
			int val = !countLetter.containsKey(key) ? 1 : countLetter.get(key) + 1; // Mapping character to their frequencies.
			countLetter.put(key, val);
		}

		ArrayList<Character> list = new ArrayList<Character>(countLetter.keySet()); // List with just the keys. Sort and comparator doesn't work with hashmap. 

		/*
		 * Compare the values of keys and sort them inside the list of keys 
		 * Reference:
		 * https://www.geeksforgeeks.org/comparator-interface-java
		 * https://www.geeksforgeeks.org/sorting-a-hashmap-according-to-values/
		 */
		
		Collections.sort(list, (a, b) -> (countLetter.get(a).compareTo(countLetter.get(b)))); // Switch get(a), get(b) for decreasing frequency.

		String sb = new String(); // Result string
		for (Character l : list) {
			for (int i = 0; i < countLetter.get(l); i++) {
				sb = sb + l; // Iterate over the key, "value" number of times and concatenate to the result string.
			}
		}

		System.out.println(sb);

		scanner.close();
	}

}
