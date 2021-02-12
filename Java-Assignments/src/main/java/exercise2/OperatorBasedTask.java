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
		int i1;
		int i2;
		
		scanner.close();
		switch (option){
		case 1:
			System.out.println("Enter numbers: ");
			i1 = scanner.nextInt();
			i2 = scanner.nextInt();
			System.out.print("Add: " + (i1+i2));
			break;
		case 2:
			System.out.println("Enter numbers: ");
			i1 = scanner.nextInt();
			i2 = scanner.nextInt();
			System.out.print("Sub: " + (i1 - i2));
			break;
		case 3:
			System.out.println("Enter numbers: ");
			i1 = scanner.nextInt();
			i2 = scanner.nextInt();
			System.out.print("Div: " + (i1/i2));
			break;
		case 4:
			System.out.println("Enter numbers: ");
			i1 = scanner.nextInt();
			i2 = scanner.nextInt();
			System.out.print("Mul: " + (i1*i2));
			break;
		case 5:
			System.out.println("Enter 4 numbers: ");
			i1 = scanner.nextInt();
			i2 = scanner.nextInt();
			int first1 = scanner.nextInt();
			int first2 = scanner.nextInt();
			System.out.print("Avg: " + (float)(i1+i2+first1+first2)/4);
			break;
		default:
			System.out.println("Enter valid operation.");
			
		}
		

	}

}
