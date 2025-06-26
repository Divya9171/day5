package com.day5;
import java.util.*;

public class Employee {
	int empid;
	String name;
	double salary;
	Date doj;
	Vehicle veh;
	public Employee() {
		doj=new Date();
		
	}
	public Employee(int empid, String name, double salary, int day, int month, int year) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		doj = new Date(day, month, year);
	}

	public void accept(Scanner sc) {
		System.out.print("Enter the empid - ");
		empid = sc.nextInt();
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the salary - ");
		salary = sc.nextDouble();
		System.out.println("Enter the date of joining - ");
		doj.accept(sc);
	}

	public void addVehicle(Scanner sc) {
		veh = new Vehicle();
		veh.accept(sc);
	}

	public void display() {
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
		System.out.print("Date of Joining - ");
		doj.display();
		if (veh != null)
			veh.display();
	}

}
