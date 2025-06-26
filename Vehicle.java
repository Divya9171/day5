package com.day5;
import java.util.*;

public class Vehicle {
	String name;
	String number;
	public Vehicle() {
		
	}
	public void Vehicle(String name,String number) {
		this.name=name;
		this.number=number;
	}
	public void accept(Scanner sc) {
		System.out.println("enter the name of vehicle");
		this.name=sc.next();
		System.out.println("enter the number of vehicle");
		this.number=sc.next();
				
	}
	public void display() {
		System.out.println("vehicle name"+this.name);
		System.out.println("vehicle name"+this.number);
			
	}

}
