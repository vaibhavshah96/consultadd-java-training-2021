package exercise3;

import java.util.Scanner;

public class FloatDecimalCompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 float point numbers: ");
		Float f1 = sc.nextFloat();
		Float f2 = sc.nextFloat();

		float delta = 0.01f;

		if (Math.abs(f1 - f2) < delta) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
		sc.close();

	}

}
