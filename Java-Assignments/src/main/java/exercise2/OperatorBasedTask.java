package exercise2;


import java.util.Scanner;

public class OperatorBasedTask {

	public static void main(String[] args) {
		
		
		System.out.println(
				"Enter your option:\n"
				+ "1 - Addition\n"
				+ "2 - Subtraction\n"
				+ "3 - Division\n"
				+ "4 - Multiplication\n"
				+ "5 - Average"
				);
		
		Scanner scanner = new Scanner(System.in);
		Integer option = scanner.nextInt();
		System.out.println("Enter 2 numbers: ");
		 int first = scanner.nextInt();
		 int second = scanner.nextInt();
		 int first1 = 0;
		 int second2 = 0;
		 float result = 0;
		if (option  ==  5) {
			System.out.println("Enter 2 more numbers: ");
			first1 = scanner.nextInt();
			second2 = scanner.nextInt();
		}
		
		
		
		
		switch (option){
		case 1:
			
			result = first+second;
			break;
		case 2:
			
			result = (first - second);
			break;
		case 3:
			
			result = first/second;
			break;
		case 4:
			result = first*second;
			break;
		case 5:
			
			result = (float)(first+second+first1+second2)/4;
			break;
		default:
			System.out.println("Enter valid operation.");
			
		}
		
		if (result < 0) {
			System.out.println("Oops! option " + option + " is returning a negative value.");
		}
		else {
			System.out.println("Result of operation is: " + result);
		}
		scanner.close();
		

	}

}
