package pluralsight.airportmanagement.queries;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import pluralsight.airportmanagement.domain.FlightInformation;
import pluralsight.airportmanagement.domain.FlightType;

import java.time.LocalDate;
import java.util.List;

@Service
public class FlightInformationQueries {
    private MongoTemplate mongoTemplate;

    public FlightInformationQueries(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<FlightInformation> findAll() {
        return null;
    }

    public List<FlightInformation> findAllOrderedBy(String field) {
        return null;
    }

    public List<FlightInformation> findAllPagedOrderedBy(String field,
                                                         int pageNb,
                                                         int pageSize) {
        return null;
    }

    public List<FlightInformation> findByDeparture(String departure) {
        return null;
    }

    public List<FlightInformation> findByDeparture(List<String> departures) {
        return null;
    }

    public List<FlightInformation> findByDurationLessThan(int nbMinutes) {
        return null;
    }

    public List<FlightInformation> findByDurationBetween(int minMinutes,
                                                         int maxMinutes) {
        return null;
    }

    public List<FlightInformation> findDelayedAtDeparture(String departure) {
        return null;
    }

    public List<FlightInformation> findRelatedToCity(String city) {
        return null;
    }

    public List<FlightInformation> findDepartBetween(LocalDate startDate,
                                                     LocalDate endDate) {
        return null;
    }

    public FlightInformation findSingleById(String id) {
        return null;
    }

    public FlightInformation findSingleByInternalId(String internalId) {
        return null;
    }

    public List<FlightInformation> findByAircraft(String aircraft) {
        return null;
    }

    public long countInternational() {
        return 0;
    }
}
