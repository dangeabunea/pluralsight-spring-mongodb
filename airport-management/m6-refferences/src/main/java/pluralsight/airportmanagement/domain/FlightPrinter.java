package pluralsight.airportmanagement.domain;

import java.util.List;

public class FlightPrinter {
    public static void print(List<FlightInformation> flights){
        String header = String.format("%-34s %-34s %-8s %-13s %-9s %-8s",
                "DEP","DST","DURATION","DATE","DELAYED","A. TYPE");
        System.out.println(header);
        for (FlightInformation f: flights) {
            String data = String.format("%-34s %-34s %-8s %-13s %-9s %-8s",
                    f.getDeparture(),
                    f.getDestination(),
                    f.getDurationMin(),
                    f.getDepartureDate(),
                    f.isDelayed(),
                    f.getAircraft().getModel());
            System.out.println(data);
        }
        System.out.println();
    }
}
