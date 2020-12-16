import entities.Cd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em=emf.createEntityManager();

        Cd cd = em.find(Cd.class,2);
        System.out.println(cd);
    }
}
