package exercise5;

import java.util.Arrays;

class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		// Map<Integer> result = new HashMap<Integer>();

		int indexOfLastOriginalNumber = 0;

		int[] numbers = { 2, 2, 3, 3, 4, 5, 6, 7, 8, 8, 9 };

		Arrays.sort(numbers);

		for (int n : numbers) {

			if (n == numbers[indexOfLastOriginalNumber]) {
				continue;
			} else {
				numbers[++indexOfLastOriginalNumber] = n;
			}

		}

		for (int j = 0; j <= indexOfLastOriginalNumber; j++) {
			System.out.print(numbers[j] + " ");
		}

	}

}
