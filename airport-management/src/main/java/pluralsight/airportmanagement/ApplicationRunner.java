package pluralsight.airportmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pluralsight.airportmanagement.domain.FlightInformation;
import pluralsight.airportmanagement.domain.FlightPrinter;
import pluralsight.airportmanagement.queries.FlightInformationQueries;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class ApplicationRunner implements CommandLineRunner {
    private FlightInformationQueries flightInformationQueries;

    public ApplicationRunner(FlightInformationQueries flightInformationQueries) {
        this.flightInformationQueries = flightInformationQueries;
    }

    @Override
    public void run(String... args) {
        // To be added
    }
}
