package exercise7;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str = "abcasthbbhjjklcsstt";

		ArrayList<Character> resultChars = new ArrayList<Character>();
		List<Character> removedChars = new ArrayList<Character>();

		for (int i = 0; i < str.length(); i++) {

			char currChar = str.charAt(i);
			
			if (resultChars.contains(currChar)) 
			{
				removedChars.add(currChar);
				resultChars.remove(resultChars.indexOf(currChar));
			} 
			else if (!removedChars.contains(currChar)) 
			{
				resultChars.add(currChar);
			}
		}

		System.out.println("First non - repeating digit is: " + resultChars.get(0));
	}

}
