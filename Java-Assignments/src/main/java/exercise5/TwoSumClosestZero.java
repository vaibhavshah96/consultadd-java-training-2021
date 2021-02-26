package exercise5;

import java.util.Arrays;

public class TwoSumClosestZero {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, -1, 12, 10, -11, 5, -7 };
		int currentSum = Integer.MAX_VALUE;
		int minSum = Integer.MAX_VALUE;
		Arrays.sort(numbers);

		int l = 0;
		int r = numbers.length - 1;
		int min_l = 0;
		int min_r = numbers.length - 1;

		while (l < r) {
			currentSum = numbers[l] + numbers[r];
			if (Math.abs(currentSum) < Math.abs(minSum)) {
				minSum = currentSum;
				min_l = l;
				min_r = r;
			}
			if (currentSum < 0) {
				l++;
			} else {
				r--;
			}
		}

		System.out.println(numbers[min_l] + " " + numbers[min_r]);

	}

}
