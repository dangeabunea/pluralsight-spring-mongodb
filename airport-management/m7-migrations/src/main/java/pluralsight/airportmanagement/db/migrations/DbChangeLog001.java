package pluralsight.airportmanagement.db.migrations;

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
    @ChangeSet(order = "001", id = "seedAirports", author = "Dan Geabunea")
    public void seedAirports(MongoTemplate mongoTemplate) {
        Airport rome = new Airport(
                "1d1aab22-670b-48cb-a027-721e2055731f",
                "Leonardo da Vinci",
                "Rome",
                42995119);

        Airport paris = new Airport(
                "d04a8c26-7527-407c-81ef-680e5de34cea",
                "Charles de Gaulle",
                "Paris",
                72229723);

        Airport copenhagen = new Airport(
                "7ed990d2-6471-485d-931e-c77729dc0f25",
                "Copenhagen Airport",
                "Copenhagen",
                30298531);

        List<Airport> airports = Arrays.asList(rome, paris, copenhagen);
        mongoTemplate.insertAll(airports);

        System.out.println("DB Migrations - ChangeLog 001, ChangeSet 001");
    }

    @ChangeSet(order = "002", id = "seedFlights", author = "John Doe")
    public void seedFlights(MongoTemplate mongoTemplate) {
        Airport rome = mongoTemplate.findById("1d1aab22-670b-48cb-a027-721e2055731f", Airport.class);
        Airport paris = mongoTemplate.findById("d04a8c26-7527-407c-81ef-680e5de34cea", Airport.class);
        Airport copenhagen = mongoTemplate.findById("7ed990d2-6471-485d-931e-c77729dc0f25", Airport.class);

        FlightInformation flightOne = new FlightInformation();
        flightOne.setId("b8b50563-ca90-4afc-9d43-b674892a525c");
        flightOne.setDelayed(false);
        flightOne.setDeparture(rome);
        flightOne.setDestination(paris);
        flightOne.setDepartureDate(LocalDate.of(2019, 3, 12));
        flightOne.setType(FlightType.International);
        flightOne.setDurationMin(80);
        flightOne.setAircraft(new Aircraft("737", 180));

        FlightInformation flightTwo = new FlightInformation();
        flightTwo.setId("c0725fbb-eebb-4aae-8b41-3887793d0c50");
        flightTwo.setDelayed(false);
        flightTwo.setDeparture(paris);
        flightTwo.setDestination(copenhagen);
        flightTwo.setDepartureDate(LocalDate.of(2019, 5, 11));
        flightTwo.setType(FlightType.International);
        flightTwo.setDurationMin(600);
        flightTwo.setAircraft(new Aircraft("747", 300));

        List<FlightInformation> flights = Arrays.asList(flightOne, flightTwo);
        mongoTemplate.insertAll(flights);

        System.out.println("DB Migrations - ChangeLog 001, ChangeSet 002");
    }
}
