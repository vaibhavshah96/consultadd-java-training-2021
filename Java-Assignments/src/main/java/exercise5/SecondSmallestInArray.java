package exercise5;

public class SecondSmallestInArray {

	public static void main(String[] args) {

		int[] numbers = { 2, 3, 5, 9, 10, 1, 7, 24, 23 };

		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for (int n : numbers) {
			if (n < first) {
				second = first;
				first = n;
			}
			if (n < second && n > first) {
				second = n;
			}
		}
		System.out.println(second);

	}

}
