package exercise5;

public class SecondLargestInArray {

	public static void main(String[] args) {

		int[] numbers = { 2, 3, 5, 9, 10, 1, 7, 24, 23 };

		if (numbers.length <= 1) {
			System.out.println("Enter larger array. ");
		}

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int n : numbers) {

			if (n > first) {
				second = first;
				first = n;
			}

			if (n > second && n < first) {
				second = n;
			}

		}

		System.out.println(second);

	}

}
