package exercise2;

import java.util.Scanner;

import java.util.function.Consumer;


public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter your number: ");
		Integer number = scanner.nextInt();
		
		consultaddJavaTraining.accept(number);
		
		scanner.close();
		
	}
	
	static Consumer<Integer> consultaddJavaTraining = (number) -> {
		String result = "";
		if(number%3 ==0) {
			result = result + "Consultadd ";
		}
		if(number%5 == 0) {
			result = result + "Java Training";
		}
		System.out.println(result);
	};

}
