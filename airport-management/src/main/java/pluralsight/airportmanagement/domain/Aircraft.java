package pluralsight.airportmanagement.domain;

import org.springframework.data.mongodb.core.index.TextIndexed;

public class Aircraft {
    private String model;
    private int nbSeats;

    public Aircraft(String model, int nbSeats) {
        this.model = model;
        this.nbSeats = nbSeats;
    }

    public String getModel() {
        return model;
    }

    public int getNbSeats() {
        return nbSeats;
    }
}
