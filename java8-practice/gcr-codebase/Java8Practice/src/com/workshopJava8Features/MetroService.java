package com.workshopJava8Features;
public class MetroService implements TransportService {

    public String getServiceName() {
        return "Metro";
    }

    public String getRoute() {
        return "A → C";
    }

    public double getFare() {
        return 50;
    }

    public LocalTimeWrapper getDepartureTime() {
        return new LocalTimeWrapper(8, 45);
    }
}
