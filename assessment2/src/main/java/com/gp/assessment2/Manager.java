package com.gp.assessment2;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Manager {

	@SuppressWarnings({ "resource", "unchecked" })
	public static void manager() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome Manager");
		System.out.println("Press 1 to show all leave requests \n Press 2 to Approve/Reject leave requests");
		int x = scan.nextInt();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		switch (x) {
		case 1:
			Query query = manager.createQuery("from Leave");
			List<Leave> resultList = query.getResultList();
			System.out.println(resultList);
			break;
		case 2: {
			System.out.println("Select \n 1.Approve Leave \n 2.Reject Leave");
			Scanner choice = new Scanner(System.in);
			int y = choice.nextInt();
			System.out.println("Enter the Serial number of leave request");
			int a = choice.nextInt();
			Leave find = manager.find(Leave.class, a);
			switch (y) {
			case 1:
				find.setStatus("Approved");
				break;

			case 2:
				find.setStatus("Rejected");
				break;
				
			default: System.out.println("Provide valid choice");
			}
			manager.persist(find);

		}
		default: System.out.println("Provide valid choice");
		}

		transaction.commit();
		manager();

	}
}
