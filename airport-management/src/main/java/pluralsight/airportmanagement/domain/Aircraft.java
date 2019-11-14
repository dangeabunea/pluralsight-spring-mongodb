package pluralsight.airportmanagement.domain;

public class Aircraft {
    private String producer;
    private String model;
    private int nbSeats;

    public Aircraft(String producer, String model, int nbSeats) {
        this.producer = producer;
        this.model = model;
        this.nbSeats = nbSeats;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getNbSeats() {
        return nbSeats;
    }
}
