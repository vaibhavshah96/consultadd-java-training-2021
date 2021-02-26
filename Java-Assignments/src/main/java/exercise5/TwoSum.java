package exercise5;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		HashMap<Integer, Integer> search = new HashMap<Integer, Integer>();

		int[] numbers = { 2, 4, 1, 12, 10, 11, 5, 7 };
		int target = 14;

		for (int i = 0; i < numbers.length; i++) {
			int diff = target - numbers[i];
			if (search.containsKey(diff)) {
				System.out.println(numbers[i] + " " + diff);
			} else {

				search.put(numbers[i], i);
			}
		}
	}

}
