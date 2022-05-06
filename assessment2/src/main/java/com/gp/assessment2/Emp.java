package com.gp.assessment2;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Emp {

	@SuppressWarnings({ "unchecked" })
	public static void employee(Employee empl) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Press 1 to show all status of leave requests ");
		System.out.println("Press 2 to request for a leave");
		int x = scan.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();

		switch (x) {
		case 1:
			Query query = manager.createQuery("From leave where serial_number=:id ");
			query.setParameter("id", empl.getId());
			List<Leave> resultList = query.getResultList();
			System.out.println(resultList);
			break;

		case 2:
			Scanner input = new Scanner(System.in);
			Leave leave = new Leave();
			System.out.println("Enter your employee Id");
			leave.setEmpId(input.nextInt());
			System.out.println("Date for leave");
			leave.setDate(input.next());
			leave.setStatus("pending");
			EntityTransaction transaction = manager.getTransaction();
			manager.persist(leave);
			transaction.begin();
			transaction.commit();
			break;
		}
		Login.login();

	}

}
