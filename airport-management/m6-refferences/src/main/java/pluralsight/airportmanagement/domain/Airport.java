package pluralsight.airportmanagement.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("airports")
public class Airport {
    @Id
    private String id;
    private String name;
    private String city;
    private int passengersServed;

    public Airport(String id, String name, String city, int passengersServed) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.passengersServed = passengersServed;
    }

    public String getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public int getPassengersServed() {
        return passengersServed;
    }

    @Override
    public String toString() {
        return String.format("%-12s %-12s %-10s",
                this.name,
                this.city,
                this.passengersServed);
    }
}
