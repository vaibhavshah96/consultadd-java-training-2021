package exercise6;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Integer number = 8208;
		int temp = number;
		int sum = 0;

		int n = number.toString().length();

		while (temp != 0) {
			sum = sum + power(temp % 10, n);

			temp = temp / 10;
		}

		if (sum == number) {
			System.out.println(number + " is an armstrong number.");
		} else {
			System.out.println(number + " is not an armstrong number.");
		}
	}

	private static int power(int i, int n) {
		int res = 1;
		while (n != 0) {
			res *= i;

			n--;
		}

		return res;
	}

}
