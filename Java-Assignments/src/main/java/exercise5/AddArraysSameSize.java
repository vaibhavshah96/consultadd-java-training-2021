package exercise5;

public class AddArraysSameSize {

	public static void main(String[] args) {

		int[] numbers1 = { 2, 6, 9 };
		int[] numbers2 = { 3, 4, 10 };

		if (numbers1.length == numbers2.length) {
			for (int i = 0; i < numbers1.length; i++) {
				numbers1[i] = numbers1[i] + numbers2[i];
				System.out.print(numbers1[i] + " ");
			}

		} else {
			System.out.println("Arrays not equal.");
		}

	}

}
