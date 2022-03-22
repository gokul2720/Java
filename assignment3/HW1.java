package com.gp.assignment3;

public class HW1 {
	String name;
	int age;
	long number;
	String address;
	int salary;
	public HW1(String name, int age, long number, String address, int salary) {
		this.name = name;
		this.age = age;
		this.number = number;
		this.address = address;
		this.salary = salary;
	}
	
	public void name () {
		System.out.println(name);
	}
	
	public void age() {
		System.out.println(age);
	}
	
	public void number() {
		System.out.println(number);
	}
	
	public void printSalary() {
		System.out.println(salary);
	}
	

}
