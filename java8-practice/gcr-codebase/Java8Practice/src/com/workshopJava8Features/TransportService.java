package com.workshopJava8Features;
public interface TransportService {

    String getServiceName();
    String getRoute();
    double getFare();
    LocalTimeWrapper getDepartureTime();

    default void printServiceDetails() {
        System.out.println(
                getServiceName() +
                "  Route: " + getRoute() +
                "  Fare: " + getFare() +
                "  Departure: " + getDepartureTime()
        );
    }
}
