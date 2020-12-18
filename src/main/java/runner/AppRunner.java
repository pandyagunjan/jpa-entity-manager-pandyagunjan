package runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@RestController
@SpringBootApplication//(scanBasePackages={"main.java.runner.controllers","main.java.runner.services","main.java.runner.repo"})
public class AppRunner  {
    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);

    }
}
