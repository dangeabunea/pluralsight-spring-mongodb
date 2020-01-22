package pluralsight.airportmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import pluralsight.airportmanagement.db.AirportRepository;
import pluralsight.airportmanagement.db.FlightInformationRepository;
import pluralsight.airportmanagement.domain.Airport;
import pluralsight.airportmanagement.domain.FlightInformation;
import pluralsight.airportmanagement.domain.FlightPrinter;

import java.util.List;

/*
This component will be the main entry point for
our use cases. It should get executed after the seeding
process
 */

@Service
@Order(2)
public class ApplicationRunner implements CommandLineRunner {
    private FlightInformationRepository flightRepository;
    private AirportRepository airportRepository;

    public ApplicationRunner(FlightInformationRepository flightRepository, AirportRepository airportRepository) {
        this.flightRepository = flightRepository;
        this.airportRepository = airportRepository;
    }

    @Override
    public void run(String... args) {
        // Single update point
        Airport rome = this.airportRepository.findById("1d1aab22-670b-48cb-a027-721e2055731f").get();
        rome.setName("Leonardo da Vinci (Fiumicino)");
        this.airportRepository.save(rome);

        System.out.println("-> AFTER UPDATE TO ROME AIRPORT");
        List<FlightInformation> flights = this.flightRepository.findAll();
        FlightPrinter.print(flights);
    }
}
