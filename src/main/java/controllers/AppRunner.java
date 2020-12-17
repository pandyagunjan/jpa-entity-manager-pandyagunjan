package controllers;

import entities.CD;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import services.CDService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//@RestController
@SpringBootApplication
public class AppRunner  {

    public static void main(String[] args) {

//        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-persistence-unit");
//        EntityManager em=emf.createEntityManager();
//
//        CD cd ;//= em.find(CD.class,2);
//       // System.out.println(cd);

        CDService cdService= new CDService();
        CD cd ;
        cd = cdService.findTheCD(1);
        cdService.saveCD(cd);
        System.out.println(cd);
    }
}
