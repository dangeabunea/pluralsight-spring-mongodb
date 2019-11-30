package pluralsight.airportmanagement.queries;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import pluralsight.airportmanagement.domain.FlightInformation;
import pluralsight.airportmanagement.domain.FlightType;

import java.util.List;

@Service
public class FlightInformationQueries {
    private MongoTemplate mongoTemplate;

    public FlightInformationQueries(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    /*
    TODO: Implement the following queries

    1) Find all flights with paging and sorting
    2) Find by flight id
    3) Count all international flights
    4) Find all flights by departure city
    5) Find all flights by duration between min and max
    6) Find all flights delayed at a particular departure city
    7) Find all flights that are on time and relate to a city
    8) Find by aircraft model

     */

}
