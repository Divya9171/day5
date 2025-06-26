package Assignment3;

public class Employee extends person {
	int empid;
	double salary;

	public Employee() {
	
	}

	public Employee(int empid, String name, String email, double salary) {
		 super(name,email);// ctor chaining
		
		this.empid = empid;
		this.salary = salary;

	}

	public void displayEmployee() {
		System.out.println("Empid - " + empid);
		displayPerson();
		System.out.println("Salary - " + salary);
	}

}
