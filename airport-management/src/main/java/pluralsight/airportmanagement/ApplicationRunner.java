package pluralsight.airportmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
In Spring Boot, a class that implements CommandLineRunner
is executed after the application is bootstrapped
 */

@Component
public class ApplicationRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started...");
    }
}
