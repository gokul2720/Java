package com.gp.assignment3;

public class Manager extends Employee{
	
	

	public Manager(String name, int age, long number, String address, int salary, String specialisation,
			String department) {
		super(name, age, number, address, salary, specialisation, department);
		
	}

	public static void main(String[] args) {
		Manager manager= new Manager("Rajan", 23, 9384445678l, "coimbatore", 30000, "instrumentation", "management");
		
		manager.name();
		manager.age();
		manager.number();
		manager.address();
		manager.printSalary();
		manager.specialisation();
		manager.department();
		
		
		
		
		
		

	}

	private void department() {
		// TODO Auto-generated method stub
		
	}

	private void specialisation() {
		// TODO Auto-generated method stub
		
	}

	private void address() {
		// TODO Auto-generated method stub
		
	}

}
