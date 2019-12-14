package pluralsight.airportmanagement.db;

import org.springframework.core.convert.converter.Converter;
import pluralsight.airportmanagement.domain.Aircraft;

public class AircraftDbWriteConverter implements Converter<Aircraft, String> {

    @Override
    public String convert(Aircraft aircraft) {
        return aircraft.getModel() + "/" + aircraft.getNbSeats();
    }
}
