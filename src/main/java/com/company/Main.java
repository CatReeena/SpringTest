package com.company;

import com.company.Cinema;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Local");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(new Cinema("Помни2"));
        entityManager.getTransaction().commit();
        entityManager.close();
        emf.close();


    }
}
