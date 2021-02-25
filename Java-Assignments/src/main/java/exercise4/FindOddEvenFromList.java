package exercise4;

public class FindOddEvenFromList {

	public static void main(String[] args) {
		int odd = 0;
		int oddCounter = 0;
		int evenCounter = 0;
		int even = 0;
//		int[] numbers = { 1, 2, 3, 5, 7, 11, 13, 17, 19 };
		int[] numbers = { 2, 4, 6, 8, 7, 12, 16, 18, 20 };
		for (int i : numbers) {

			if (i % 2 == 0) {
				even = i;
				evenCounter++;
			} else {
				odd = i;
				oddCounter++;
			}

			if (oddCounter > 1 && evenCounter == 1) {
				System.out.println(even);
				break;
			} else if (evenCounter > 1 && oddCounter == 1) {
				System.out.println(odd);
				break;
			}
		}

	}

}
