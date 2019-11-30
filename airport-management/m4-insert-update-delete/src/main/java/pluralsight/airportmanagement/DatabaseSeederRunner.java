package pluralsight.airportmanagement;

import org.bson.types.ObjectId;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import pluralsight.airportmanagement.domain.Aircraft;
import pluralsight.airportmanagement.domain.FlightInformation;
import pluralsight.airportmanagement.domain.FlightType;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/*
This component should populate the database if empty.
 */

@Component
@Order(1)
public class DatabaseSeederRunner implements CommandLineRunner {
    private MongoTemplate mongoTemplate;

    public DatabaseSeederRunner(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        empty();
        seed();
    }

    private void empty(){

    }

    private void seed(){

    }
}
