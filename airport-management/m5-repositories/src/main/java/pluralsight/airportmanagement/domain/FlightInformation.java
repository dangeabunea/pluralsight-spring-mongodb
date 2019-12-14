package pluralsight.airportmanagement.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.util.UUID;

@Document("flights")
public class FlightInformation {
    @Id
    private String id;

    @Indexed(unique = true)
    private String internalId;

    @Field("departure")
    @TextIndexed
    private String departureCity;

    @Field("destination")
    @TextIndexed
    private String destinationCity;

    @TextIndexed(weight = 2)
    private String description;

    private FlightType type;
    private boolean isDelayed;
    private int durationMin;
    private LocalDate departureDate;
    private Aircraft aircraft;

    @Transient
    private LocalDate createdAt;

    public FlightInformation() {
        this.createdAt = LocalDate.now();
        this.internalId = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public FlightType getType() {
        return type;
    }

    public void setType(FlightType type) {
        this.type = type;
    }

    public boolean isDelayed() {
        return isDelayed;
    }

    public void setDelayed(boolean delayed) {
        isDelayed = delayed;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public String getInternalId() {
        return internalId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
