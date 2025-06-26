package com.day5;
import java.util.*;
public class Date {
    int day;
    int month;
    int year;
    public Date() {
    	
    }
    public  Date(int day,int month,int year) {
    	this.day=day;
    	this.month=month;
    	this.year=year;
    }
    public void accept(Scanner sc) {
    	System.out.println("enetr day");
    	this.day=sc.nextInt();
    	System.out.println("enetr month");
    	this.month=sc.nextInt();
    	System.out.println("enetr year");
    	this.year=sc.nextInt();
    	  
    }
    public void display() {
    	System.out.println("joining date is"+this.day+ "/" +this.month+ "/" +this.year);
    }
}

