package exercise5;

import java.util.Arrays;

public class RemoveDupesAddZero {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 2, 1, 1, 1, 12, 10, 11, 5, 7 };
		int j = 0;
		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length - 1; i++) {

			if (numbers[i] != numbers[i + 1]) {
				numbers[j] = numbers[i];
				j++;
			}
		}
		numbers[j++] = numbers[numbers.length - 1];

		for (int i = j; i < numbers.length; i++) {
			numbers[i] = 0;
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
