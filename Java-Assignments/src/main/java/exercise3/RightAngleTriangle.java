package exercise3;

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String triangle = new String();

		System.out.println("Enter number: ");
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			triangle = triangle + i;
			System.out.println(triangle);
		}

		scanner.close();

	}

}
