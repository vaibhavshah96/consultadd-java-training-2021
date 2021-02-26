package exercise5;

import java.util.Arrays;

public class SortFirstMaxSecondMin {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 1, 12, 10, 11, 5, 7 };
		int[] result = new int[numbers.length];
		Arrays.sort(numbers);
		boolean flag = true;
		int l = 0;
		int r = numbers.length - 1;
		int i = 0;
		while (l <= r) {
			if (flag) {
				result[i] = numbers[r];
				r--;
				i++;
			} else {
				result[i] = numbers[l];
				i++;
				l++;
			}
			flag = !flag;
		}

		for (i = 0; i < numbers.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

}
