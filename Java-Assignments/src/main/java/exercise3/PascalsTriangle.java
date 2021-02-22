package exercise3;

import java.util.Scanner;

public class PascalsTriangle {

	private static void generatePascalsTriangle(int i) {

		int[][] arr = new int[i][i];
		int k = 1;
		if (i == 0) {
			System.out.println("");
		}

		for (int j = 0; j < i; j++) {

			if (j == 0) {
				arr[j][j] = 1;
				System.out.println(arr[j][0]);

			} else {
				arr[j][0] = 1;
				arr[j][j] = 1;
				System.out.print(arr[j][0]);
				while (k < j) {
					arr[j][k] = arr[j - 1][k - 1] + arr[j - 1][k];
					System.out.print(arr[j][k]);
					k++;
				}
				System.out.print(arr[j][k] + "\n");

				k = 1;

			}
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of rows:");

		int i = scanner.nextInt();

		generatePascalsTriangle(i);

		scanner.close();

	}

}
