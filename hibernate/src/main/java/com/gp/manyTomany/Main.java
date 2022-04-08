package com.gp.manyTomany;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		User gokul = new User();
		gokul.setName("gokul");
		gokul.setMailId("gokul@gmail.com");
		gokul.setPassword("gokul");
		
		User sasi = new User();
		sasi.setName("sasi");
		sasi.setMailId("sasi@gmail.com");
		sasi.setPassword("sasi");
		
		Application whatsapp = new Application();
		whatsapp.setId(1);
		whatsapp.setName("whatsapp");
		whatsapp.setCategory("social");
		
		Application insta = new Application();
		insta.setId(2);
		insta.setName("instagram");
		insta.setCategory("social");
		
		gokul.setApps(Arrays.asList(whatsapp,insta));
		sasi.setApps(Arrays.asList(whatsapp,insta));
		
		whatsapp.setUser(Arrays.asList(gokul,sasi));
		insta.setUser(Arrays.asList(gokul,sasi));
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("many");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(gokul);
		manager.persist(sasi);
		transaction.commit();
	}
}
