package exercise7;

public class NumberOfWordsInString {

	public static void main(String[] args) {

		String str = "The quick brown fox jumped over the lazy dog.";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}

		System.out.println("Number of words is " + (count + 1));

	}

}
