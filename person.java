package Assignment3;
import java.util.Scanner;

public class person {
	String name;
	String email;

	public person() {
		System.out.println("Person()");
	}

	public person(String name, String email) {
		//System.out.println("Person(String,String)");
		this.name = name;
		this.email = email;
	}

	public void acceptPerson(Scanner sc) {
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the email - ");
		email = sc.next();
	}

	public void displayPerson() {
		System.out.println("Name - " + name);
		System.out.println("Email - " + email);
	}

}
