package com.workshopJava8Features;
public class TaxiService implements TransportService {

    public String getServiceName() {
        return "Taxi";
    }

    public String getRoute() {
        return "B → C";
    }

    public double getFare() {
        return 120;
    }

    public LocalTimeWrapper getDepartureTime() {
        return new LocalTimeWrapper(9, 0);
    }
}
