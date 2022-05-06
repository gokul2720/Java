package com.gp.assessment2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Register {

	public static void register() {
		System.out.println("REGISTRATION");
		Scanner scan = new Scanner(System.in);
		Employee employee = new Employee();
		try {
		System.out.println("Create your Employee id");
		employee.setId(scan.nextInt());
		System.out.println("Enter your name:");
		employee.setName(scan.next());
		System.out.println("Enter your mailId");
		employee.setMailId(scan.next());
		System.out.println("Give employee type: \n 1.Manager \n 2.Employee");
		int x = scan.nextInt();
		switch (x) {
		case 1:
			employee.setTypeOfEmp("manager");
			break;
		case 2:
			employee.setTypeOfEmp("employee");
			break;
		default:
			System.out.println("enter valid details");
		}
		System.out.println("Create new Password");
		employee.setPassword(scan.next());

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(employee);
		transaction.begin();
		transaction.commit();
		}catch(Exception e) {
			System.out.println("give valid Id");
		}

		System.out.println("Registration complete. Please login");
		Login.login();
	}
}
