package exercise6;




class Employee{
	String name = new String();
	String yearOfJoining = new String();
	Double salary;
	String address = new String();

	
	Employee(String name, String yearOfJoining, Double salary, String address){
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.address = address;
	}


	@Override
	public String toString() {
		return (name + " \t " + yearOfJoining + " \t\t\t " + salary + " \t "
				+ address);
	}
	
	
}

public class PringEmployeeDetails {

	public static void main(String[] args) {
		
		Employee e1 = new Employee ("Vaib", "2009", 2500.00, "14 D Street");
		Employee e2 = new Employee ("John", "2007", 4500.00, "7 Ramsey St.");
		Employee e3 = new Employee ("Emily", "2013", 1750.00, "12 Hamilton St.");
		
		System.out.println("Name \t Year Of Joining \t Salary \t Address");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());

	}

}
