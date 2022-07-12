package com.practice;

import com.practice.entity.Users;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Logger;

public class Test2LevelCache {
    Logger log = Logger.getLogger(this.getClass().getName());
    private EntityManagerFactory emf;

    @Before
    public void init() {
        emf = Persistence.createEntityManagerFactory("com.practice.jpa_hibernate");
    }

    @After
    public void close() {
        emf.close();
    }


    @Test
    public void getUser() {
        log.info("--------------------------------------------session 1");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Users user1 = em.find(Users.class, 1);
        log.info("--------------------------------------------user 1: {}" + user1);

        em.getTransaction().commit();
        em.close();
        log.info("--------------------------------------------closed session 1");

        //------------------------------------------------------------------

        log.info("--------------------------------------------session 2");

        EntityManager em2 = emf.createEntityManager();
        em2.getTransaction().begin();
        Users user2 = em2.find(Users.class, 1);
        log.info("--------------------------------------------user 2 from a second transaction: {}" + user2);

        em2.getTransaction().commit();
        em2.close();
    }
}