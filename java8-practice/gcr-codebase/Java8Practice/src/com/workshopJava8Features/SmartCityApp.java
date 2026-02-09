package com.workshopJava8Features;
import java.util.*;

import java.util.stream.*;

public class SmartCityApp {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService(),
                new MetroService(),
                new TaxiService(),
                new AmbulanceService()
        );

       
        System.out.println("\n🔹 Filtered & Sorted Services:");
        services.stream()
                .filter(s -> s.getFare() <= 50)
                .sorted(Comparator.comparingInt(
                        s -> s.getDepartureTime().toMinutes()))
                .forEach(TransportService::printServiceDetails);

             System.out.println("\n🔹 Live Dashboard:");
        services.forEach(TransportService::printServiceDetails);

     
        DoubleSummaryStatistics stats =
                services.stream()
                        .collect(Collectors.summarizingDouble(
                                TransportService::getFare));

        System.out.println("\nTotal Revenue: ₹" + stats.getSum());
        System.out.println("Average Fare: ₹" + stats.getAverage());

     
        Map<String, List<TransportService>> byRoute =
                services.stream()
                        .collect(Collectors.groupingBy(
                                TransportService::getRoute));

        System.out.println("\nServices by Route:");
        byRoute.forEach((r, l) ->
                System.out.println(r + " → " + l.size()));

     
        Map<Boolean, List<TransportService>> peak =
                services.stream()
                        .collect(Collectors.partitioningBy(
                                s -> s.getFare() > 50));

        System.out.println("\nPeak Services: " + peak.get(true).size());
        System.out.println("Non-Peak Services: " + peak.get(false).size());

     
        FareCalculator calculator =
                distance -> 20 + (distance * 10);

        double distance =
                GeoUtils.calculateDistance(0, 0, 3, 4);

        System.out.println("\nTaxi Fare for "
                + distance + " km = "
                + calculator.calculateFare(distance));

      
        System.out.println("\n🚨 Emergency Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s ->
                        System.out.println(
                                s.getServiceName() + " has priority"));
    }
}
