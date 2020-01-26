package pluralsight.airportmanagement.db;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import org.springframework.data.mongodb.core.MongoTemplate;
import pluralsight.airportmanagement.domain.Aircraft;
import pluralsight.airportmanagement.domain.Airport;
import pluralsight.airportmanagement.domain.FlightInformation;
import pluralsight.airportmanagement.domain.FlightType;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@ChangeLog(order = "001")
public class DbChangeLog001 {


}
