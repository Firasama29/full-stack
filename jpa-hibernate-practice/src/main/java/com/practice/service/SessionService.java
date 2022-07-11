package com.practice.service;

import com.practice.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionService {

    public static void main(String[] args) {
        User user = new User();

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.persist(user);

        session.getTransaction().commit();

        session.close();
    }
}
