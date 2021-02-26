package exercise6;

class Complex {
	private int real;
	private int imaginary;

	public Complex() {

	}

	public Complex(int real, int imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
		System.out.println(real + "+" + imaginary + "i");

	}

	public static String addComplex(Complex c1, Complex c2) {
		Complex res = new Complex();
		
		res.real = c1.real + c2.real;
		res.imaginary = c1.imaginary + c2.imaginary;
		
		return printComplex(res);
	}

	public static String subComplex(Complex c1, Complex c2) {
		Complex res = new Complex();
		
		res.real = c1.real - c2.real;
		res.imaginary = c1.imaginary - c2.imaginary;
		
		return printComplex(res);

	}

	public static String mulComplex(Complex c1, Complex c2) {
		Complex res = new Complex();
		
		res.real = (c1.real * c2.real) + (c1.imaginary * c2.imaginary);
		res.imaginary = (c1.real * c2.imaginary) + (c1.imaginary * c2.real);
		
		
		
		return printComplex(res);
	}

	public static String printComplex(Complex c) {
		return (c.real + "+" + c.imaginary + "i");
	}

}

public class SumDiffProductOfComplex {

	public static void main(String[] args) {

		Complex c1 = new Complex(3, 4);
		Complex c2 = new Complex(5, 3);

		System.out.println(Complex.mulComplex(c1, c2));

	}

}
