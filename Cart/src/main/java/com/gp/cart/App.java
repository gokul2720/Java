package com.gp.cart;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        Cart cart = new Cart();
        
        Item item = new Item();
        item.setId(1);
        item.setCategory("phone");
        item.setProductName("realme");
        item.setProductPrice(10000);
        item.setProductRating(4);
        item.setQuantity(1);
        
        Item item2 = new Item();
        item2.setId(2);
        item2.setCategory("laptop");
        item2.setProductName("lenovo");
        item2.setProductPrice(40000);
        item2.setProductRating(5);
        item.setQuantity(1);
        
        cart.setItem(Arrays.asList(item,item2));
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("cart");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        manager.persist(cart);
        transaction.begin();
        transaction.commit();
        
        
        
    }
}
