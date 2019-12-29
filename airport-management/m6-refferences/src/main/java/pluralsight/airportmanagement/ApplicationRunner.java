package pluralsight.airportmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import pluralsight.airportmanagement.db.FlightInformationRepository;
import pluralsight.airportmanagement.domain.FlightInformation;
import pluralsight.airportmanagement.domain.FlightPrinter;

import java.util.Arrays;
import java.util.List;

/*
This component will be the main entry point for
our use cases. It should get executed after the seeding
process
 */

@Service
@Order(2)
public class ApplicationRunner implements CommandLineRunner {
    private FlightInformationRepository repository;

    public ApplicationRunner(FlightInformationRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        printById("4d23fd8b-47a7-45f8-958c-94d0e21488b2");

        delayFlight("4d23fd8b-47a7-45f8-958c-94d0e21488b2", 30);

        removeFlight("4d23fd8b-47a7-45f8-958c-94d0e21488b2");

        printByDepartureAndDestination("Madrid", "Barcelona");

        printByMinNbSeats(200);
    }

    private void printById(String id) {

    }

    private void delayFlight(String id, int duration) {

    }

    private void removeFlight(String id) {

    }

    private void printByDepartureAndDestination(String dep, String dst) {

    }

    private void printByMinNbSeats(int minNbSeats) {

    }
}
