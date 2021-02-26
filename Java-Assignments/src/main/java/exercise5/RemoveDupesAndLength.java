package exercise5;

import java.util.Arrays;

public class RemoveDupesAndLength {

	public static void main(String[] args) {
		
		int[] numbers = { 2, 4, 2, 1, 1, 1, 12, 10, 11, 5, 7 };
		int j = 0;
		Arrays.sort(numbers);
		
		for (int i = 1 ; i < numbers.length; i ++) {
			if (numbers[i] != numbers[i -1]) {
				numbers[j]= numbers[i];
				j++;
			}
		}
		
		System.out.println("Length of non duplicate array = " + (j));
		for (int i = 0; i < j; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
