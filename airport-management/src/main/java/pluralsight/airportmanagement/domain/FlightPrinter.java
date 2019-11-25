package pluralsight.airportmanagement.domain;

import java.util.List;

public class FlightPrinter {
    public static void print(List<FlightInformation> flights){
        String header = String.format("%-12s %-12s %-8s %-13s %-9s %-8s %-8s","DEP","DST","DURATION","DATE","DELAYED","A. TYPE", "A. SEATS");
        System.out.println(header);
        for (FlightInformation f: flights) {
            String data = String.format("%-12s %-12s %-8s %-13s %-9s %-8s %-8s",
                    f.getDepartureCity(),
                    f.getDestinationCity(),
                    f.getDurationMin(),
                    f.getDepartureDate(),
                    f.isDelayed(),
                    f.getAircraft().getModel(),
                    f.getAircraft().getNbSeats());
            System.out.println(data);
        }
        System.out.println();
    }
}
