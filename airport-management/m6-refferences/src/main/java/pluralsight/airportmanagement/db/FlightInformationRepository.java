package pluralsight.airportmanagement.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pluralsight.airportmanagement.domain.FlightInformation;

@Repository
public interface FlightInformationRepository
        extends MongoRepository<FlightInformation, String> {

}
