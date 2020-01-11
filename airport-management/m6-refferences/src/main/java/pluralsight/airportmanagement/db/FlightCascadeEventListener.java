package pluralsight.airportmanagement.db;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;
import pluralsight.airportmanagement.domain.FlightInformation;

public class FlightCascadeEventListener extends AbstractMongoEventListener<Object> {

}
