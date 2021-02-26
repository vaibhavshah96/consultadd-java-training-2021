package exercise6;

class Programming {

	String toPrint = "I love ";

	Programming() {
		toPrint = toPrint + "programming languages";
		System.out.println(toPrint);
	}

	Programming(String addToPrint) {
		toPrint = toPrint + addToPrint;
		System.out.println(toPrint);
	}

}

public class PrintProgrammingLanguage {

	public static void main(String[] args) {

		Programming p1 = new Programming();
		Programming p2 = new Programming("Java");

	}

}
