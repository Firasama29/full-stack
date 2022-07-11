package com.practice.service.containermanaged;

import com.practice.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 * NOT WORKING YET
 */
public class ExtendedScopePersistenceContext {
    //type = PersistenceContextType.EXTENDED
    @PersistenceContext(unitName = "com.practice.jpa_hibernate", type = PersistenceContextType.EXTENDED)
    private static EntityManager em;

    public static void main(String[] args) {
        em.getTransaction().begin();
        Users user = new Users("ExtendedScope Persistence Context");
        //em.persist(user);
        Users users = em.find(Users.class, 1);
        System.out.println(users + ", " + users.getUserId());
    }
}