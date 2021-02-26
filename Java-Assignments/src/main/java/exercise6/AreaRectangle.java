package exercise6;

class Rectangle {
	int length;
	int breadth;

	Rectangle() {
		this.length = 0;
		this.breadth = 0;
	}

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	Rectangle(int length) {
		this.length = length;
		this.breadth = length;
	}

	public int area() {
		return (this.length * this.breadth);
	}

}

public class AreaRectangle {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2, 3);
		Rectangle r3 = new Rectangle(2);

		System.out.println(r1.area());
		System.out.println(r2.area());
		System.out.println(r3.area());

	}

}
