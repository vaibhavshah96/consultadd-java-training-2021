package exercise6;

class Student {
	String name = "Unknown";

	Student() {

	}

	Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name;
	}

}

public class StudentName {

	public static void main(String[] args) {

		Student student1 = new Student();
		Student student2 = new Student("Lisa");

		System.out.println(student1.toString());
		System.out.println(student2.toString());
	}

}
