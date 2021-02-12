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
		int option = scanner.nextInt();
		System.out.println("Enter numbers: ");
		int i1 = scanner.nextInt();
		int i2 = scanner.nextInt();
		
		scanner.close();
		switch (option){
		case 1:
			System.out.print("Add: " + (i1+i2));
			break;
		case 2:
			System.out.print("Sub: " + (i1 - i2));
			break;
		case 3:
			System.out.print("Div: " + (i1/i2));
			break;
		case 4:
			System.out.print("Mul: " + (i1*i2));
			break;
		case 5:
			System.out.print("Avg: " + (float)(i1+i2)/2);
			break;
		default:
			System.out.println("Enter valid operation.");
			
		}
		

	}

}
