package exercise7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArrays {

	public static void main(String[] args) {

		int[] a1 = { 2, 3, 4, 7, 1 };
		int[] a2 = { 1, 5, 11, 7, 13 };
		List<Integer> intersection = new ArrayList<Integer>();

		Arrays.sort(a1);
		Arrays.sort(a2);

		int i = 0, j = 0;

		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				i++;
			} else if (a1[i] > a2[j]) {
				j++;
			} else {
				intersection.add(a1[i]);
				i++;
				j++;
			}
		}

		intersection.stream().forEach(s -> System.out.print(" " + s));

	}

}
