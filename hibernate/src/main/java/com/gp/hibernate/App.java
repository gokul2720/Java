package com.gp.hibernate;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee(1,"gokul","engineer",20000);
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("employee");
        EntityManager entityManager = managerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//        entityManager.persist(employee);
//        transaction.begin();
//        transaction.commit();
       Scanner scan= new Scanner(System.in);
       int i= scan.nextInt();
        
        Query query = entityManager.createQuery("select name from Employee where id=:in");
        query.setParameter("in", i);
        
//        List<Employee> list = query.getSingleResult();
        
        Object result = query.getSingleResult();
        
        System.out.println("name of id number "+i+" is:"+result);
        
//        Query query1 = entityManager.createQuery("select count(*) from Employee");
//        
//        Object result2 = query1.getSingleResult();
//        
//        System.out.println(result2);
    }
}
