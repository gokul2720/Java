package com.gp.assignment3;

public class Employee extends HW1 {
	String specialisation;
	String department;
	public Employee(String name, int age, long number, String address, int salary, String specialisation,
			String department) {
		super(name, age, number, address, salary);
		this.specialisation = specialisation;
		this.department = department;
	}
	
	
	

	
}
