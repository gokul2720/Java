package com.gp.day5.encapsulation;

public class Company {

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		emp.setName("Rajjan");
		emp.setAge(21);
		emp.setDesignation("Trainee");
		emp.setSalary(10000);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		
	}

}
