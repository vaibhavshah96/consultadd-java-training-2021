package exercise7;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello, World!";
		
		int len = str.length();
		
		StringBuilder resString = new StringBuilder();
		
		for (int i = len - 1; i>= 0; i--) {
			resString.append(str.charAt(i));
		}
		
		System.out.println(resString);
	}

}
