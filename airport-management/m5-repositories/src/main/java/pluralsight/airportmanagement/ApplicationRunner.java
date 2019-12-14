package pluralsight.airportmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
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
    private MongoTemplate mongoTemplate;

    public ApplicationRunner(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        markAllFlightsToRomeAsDelayed();
        removeFlightsWithDurationLessThanTwoHours();
    }

    void markAllFlightsToRomeAsDelayed() {
        Query departingFromRome = Query.query(
                Criteria.where("destination").is("Rome")
        );

        Update setDelayed = Update.update("isDelayed", true);

        this.mongoTemplate.updateMulti(
                departingFromRome,
                setDelayed,
                FlightInformation.class);
    }

    void removeFlightsWithDurationLessThanTwoHours() {
        Query lessThanTwoHours = Query.query(
                        Criteria.where("duration").lt(120)
                );

        mongoTemplate.findAllAndRemove(lessThanTwoHours, FlightInformation.class);
    }
}
