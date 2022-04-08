package com.gp.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.gp.student.Student;

public class App 
{
    public static void main( String[] args )
    {
    	 Student student = new Student(2,"gokul","eie",95);
         EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("student");
         EntityManager entityManager = managerFactory.createEntityManager();
         EntityTransaction transaction = entityManager.getTransaction();
         //to give data
         entityManager.persist(student);
         transaction.begin();
         transaction.commit();
         //to get data
//         Student find = entityManager.find(Student.class, 2);
//         Student reference = entityManager.getReference(Student.class, 2);
//         
//         System.out.println("this is the reference===>"+ reference);
//         System.out.println(find);
         
         //to remove data
//         Student merge = entityManager.merge(student);
//         entityManager.remove(merge);
//         transaction.begin();
//         transaction.commit();
         
         //to edit a data
         Student gokul = entityManager.find(Student.class, 2);
         gokul.setDepartment("ei");
         entityManager.persist(gokul);
         transaction.begin();
         transaction.commit();
         
         
         
        
         
    }
}
