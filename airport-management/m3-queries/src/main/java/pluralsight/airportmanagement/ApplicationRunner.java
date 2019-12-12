package pluralsight.airportmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import pluralsight.airportmanagement.domain.Aircraft;
import pluralsight.airportmanagement.domain.FlightInformation;
import pluralsight.airportmanagement.domain.FlightPrinter;
import pluralsight.airportmanagement.domain.FlightType;
import pluralsight.airportmanagement.queries.FlightInformationQueries;

import java.time.LocalDate;
import java.util.List;

@Component
public class ApplicationRunner implements CommandLineRunner {
    private FlightInformationQueries flightInformationQueries;

    public ApplicationRunner(FlightInformationQueries flightInformationQueries) {
        this.flightInformationQueries = flightInformationQueries;
    }

    @Override
    public void run(String... args) {
        System.out.println("-----\nQUERY: All flights ordered by departure");
        List<FlightInformation> allFlightsOrdered = this.flightInformationQueries
                .findAll("departure", 0, 10);
        FlightPrinter.print(allFlightsOrdered);

        System.out.println("-----\nQUERY: Free text search: Rome");
        List<FlightInformation> flightsByFreeText = this.flightInformationQueries
                .findByFreeText("Rome");
        FlightPrinter.print(flightsByFreeText);
    }
}
