package com.day5;
import java.util.*;

public class program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		Scanner sc =new Scanner(System.in);
		
		e1.accept(sc);
		e1.display();
		e2.addVehicle(sc);
		e2.accept(sc);
		e2.display();

	}

}
