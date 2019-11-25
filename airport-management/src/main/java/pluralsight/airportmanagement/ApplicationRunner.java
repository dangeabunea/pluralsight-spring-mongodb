package pluralsight.airportmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import pluralsight.airportmanagement.domain.FlightInformation;
import pluralsight.airportmanagement.domain.FlightPrinter;
import pluralsight.airportmanagement.queries.FlightInformationQueries;

import java.util.List;

@Component
public class ApplicationRunner implements CommandLineRunner {
    private FlightInformationQueries flightInformationQueries;

    public ApplicationRunner(FlightInformationQueries flightInformationQueries, MongoTemplate mongoTemplate) {
        this.flightInformationQueries = flightInformationQueries;
    }

    @Override
    public void run(String... args) {

    }
}
