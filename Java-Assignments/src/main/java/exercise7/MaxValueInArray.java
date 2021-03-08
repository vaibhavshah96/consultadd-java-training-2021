package exercise7;

public class MaxValueInArray {

	public static void main(String[] args) {
		int[] numbers = { 3, 1, 13, 17, 14, 11, 26, 31, 9 };
		int max = Integer.MIN_VALUE;

		for (int i : numbers) {
			max = Math.max(i, max);
		}

		System.out.println(max);

	}

}
