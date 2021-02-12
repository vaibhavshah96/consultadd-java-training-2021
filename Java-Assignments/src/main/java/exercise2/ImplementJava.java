package exercise2;

public class ImplementJava {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		int avg = (a+b+c)/3;
		
		boolean justOne = true;
		
		System.out.println("Avg = " + avg);
		
		boolean greaterThanA = (avg > a);
		boolean greaterThanB = (avg > b);
		boolean greaterThanC = (avg > c);
		
		String result = "";
		
		if (greaterThanA) {
				result = "Avg higher than " + "a";
				if(greaterThanB) {
					justOne = false;
					result = result + ",b";
				}
				if(greaterThanC) {
					justOne = false;
					result = result + ",c";
				}
				
				result = justOne? "Avg just higher than a" : result;
				
				
			}
		
		else if (greaterThanB) {
			result = "Avg higher than " + "b";
			if(greaterThanC) {
				justOne = false;
				result = result + ",c";
			}	
			result = justOne? "Avg just higher than b" : result;
		}
		
		else if (greaterThanC) {
			result = "Avg just higher than c";
		}
		
		
		System.out.println(result);
		}

}
