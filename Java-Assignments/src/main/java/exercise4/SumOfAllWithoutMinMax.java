package exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumOfAllWithoutMinMax {

	public static void main(String[] args) {

		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter comma seperated values.");
		String numberString = sc.next();

		List<Integer> numbers = Arrays.stream(numberString.split(",")).map(Integer::parseInt)
				.collect(Collectors.toList());

		numbers.sort(null);

		Integer min = numbers.get(0);
		Integer max = numbers.get(numbers.size() - 1);

		for (int i = numbers.lastIndexOf(min) + 1; i < numbers.indexOf(max); i++) {
			sum = sum + numbers.get(i);
		}

		sc.close();
		System.out.println(sum);
	}

}
