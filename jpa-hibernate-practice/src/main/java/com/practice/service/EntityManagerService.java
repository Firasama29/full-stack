package com.practice.service;

import com.practice.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
    sources {
        https://dzone.com/articles/jpa-entitymanagerfactory-interface-with-example
    }

 */
public class EntityManagerService {
    public static void main(String[] args) {
        Users user = new Users("Firas");
        //create an entityManager factory and create an entityManager instance from it
        //Persistence class is used to obtain an EntityManagerFactory interface
        /** ONE ENTITYMANAGER INSTANCE AND ONE TRANSACTION */
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.practice.jpa_hibernate");
        EntityManager em = emf.createEntityManager();

        //start a transaction
        em.getTransaction().begin();
        //persist the object
        user.setUserName("Feras");
        em.persist(user);
        //commit
        em.getTransaction().commit();
        //close entityManager instance
        System.out.println("user from Persistence Context: " + em.find(Users.class,1));
        em.close();
    /**-------------------------------------------------------------------------------------------*/
        /** NEW ENTITYMANAGER INSTANCE AND NEW TRANSACTION */
        EntityManager em2 = emf.createEntityManager();
        em2.getTransaction().begin();
        System.out.println("user within second transaction from the DB: " + em2.find(Users.class, 1));
        em2.getTransaction().commit();

        em2.getTransaction().begin();
        //update user
        user.setUserName("Firas");
        em2.merge(user);
        em2.getTransaction().commit();
        em2.close();
        emf.close();
    }
}
