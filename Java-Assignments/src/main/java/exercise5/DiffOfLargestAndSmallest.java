package exercise5;

public class DiffOfLargestAndSmallest {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 1, 12, 10, 11, 5, 7 };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		if (numbers.length >= 1) {
			for (int n : numbers) {
				min = Math.min(min, n);
				max = Math.max(max, n);
			}
			System.out.println(max - min);
		} else {
			System.out.println("Enter array with 2 or more elements.");
		}

	}

}
