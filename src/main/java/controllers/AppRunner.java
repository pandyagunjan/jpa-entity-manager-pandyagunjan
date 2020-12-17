package controllers;

import entities.CD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import services.CDService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//@RestController
@SpringBootApplication
public class AppRunner  {

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);

    }
}
