package ManagerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emutil {
    public static EntityManager entityManager(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("College");
        EntityManager em=emf.createEntityManager();
        return em;
    }


}
