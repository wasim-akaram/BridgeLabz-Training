package com.workshopJava8Features;
public class BusService implements TransportService {

    public String getServiceName() {
        return "Bus";
    }

    public String getRoute() {
        return "A → B";
    }

    public double getFare() {
        return 30;
    }

    public LocalTimeWrapper getDepartureTime() {
        return new LocalTimeWrapper(9, 15);
    }
}
