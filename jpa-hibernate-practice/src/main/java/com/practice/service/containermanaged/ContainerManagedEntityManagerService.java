package com.practice.service.containermanaged;

import com.practice.entity.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
/**
 * NOT WORKING YET
 */
public class ContainerManagedEntityManagerService {
    //type = PersistenceContextType.TRANSACTION
    @PersistenceContext(unitName = "com.practice.jpa_hibernate", type = PersistenceContextType.TRANSACTION)
    private static EntityManager entityManager;

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(ContainerManagedEntityManagerService.class);
        entityManager.getTransaction().begin();
        Users users = new Users("Firas_dev");
        entityManager.persist(users);
        Users user1 = entityManager.find(Users.class, 1);
        log.info("user from the Persistence Context: {}", user1);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}