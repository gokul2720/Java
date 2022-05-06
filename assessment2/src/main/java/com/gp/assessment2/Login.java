package com.gp.assessment2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Login {

	@SuppressWarnings("resource")
	public static void login() {
		System.out.println("LOGIN");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your employee id");
		int id = input.nextInt();
		System.out.println("Enter your password");
		String password = input.next();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		Employee find = manager.find(Employee.class, id);
		int empId = find.getId();
		String pass = find.getPassword();
		String typeOfEmp = find.getTypeOfEmp();
		String a = "employee";
		String b = "manager";

		if (password.contentEquals(pass) && empId==id) {
			if (typeOfEmp.contentEquals(a)) {
				System.out.println("Employee Logged in successfully");
				Emp.employee(find);
			} else if (typeOfEmp.contentEquals(b)) {
				System.out.println("Manager logged in successfully");
				Manager.manager();
			}
		} else {
			System.out.println("Invalid mailId or password");
			login();
		}
	}

}
