package exercise3;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter year and month (yyyy-mm): ");

		String dateString = scanner.nextLine();

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM");

		YearMonth date;

		try {
			date = YearMonth.parse(dateString, dateTimeFormatter);
			System.out.println("Number of days : " + date.lengthOfMonth());
		} catch (Exception e) {
			System.out.println("Check month entered or enter correct format: yyyy-mm");
		}

		scanner.close();

	}

}
