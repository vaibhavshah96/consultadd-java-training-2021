package exercise4;

public class ReverseCase {

	public static void main(String[] args) {
		StringBuilder resultString = new StringBuilder();

		String str = "hEllOO WoRlD";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				resultString.append(Character.toUpperCase(str.charAt(i)));
			} else {
				resultString.append(Character.toLowerCase(str.charAt(i)));
			}
		}

		System.out.println(resultString);

	}

}
