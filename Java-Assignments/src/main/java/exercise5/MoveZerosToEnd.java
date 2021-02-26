package exercise5;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		
		int[] numbers = {2, 0, 4, 1, 0, 12, 0, 0, 10, 0};
		
		int j = 0; // makes stops at 0.
		 
		
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] != 0) {
				numbers[j] = numbers[i];
				j++;
			}
			
		}
		
		System.out.println("Number of zeros = " + (numbers.length - j));
		
		for(int i = numbers.length - 1; i >= (numbers.length - j); i--) {
			numbers[i] = 0;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
