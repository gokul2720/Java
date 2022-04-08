package com.gpe.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		Trainee trainee = new Trainee();
		trainee.setName("gokul");
		trainee.setSalary(30000);
		trainee.setDesignation("engineer");

		Laptop laptop = new Laptop();
		laptop.setId(101);
		laptop.setBrand("dell");
		laptop.setBaterry("dell");
		laptop.setRom("1 tb");
		laptop.setTrainee(trainee);

		trainee.setLaptop(laptop);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("factory");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(laptop);
//		manager.persist(trainee);
		transaction.begin();
		transaction.commit();

	}

}
