package com.functionalInterface.temperarureAlertSystem;
import java.util.function.Predicate;

public class TemperatureAlert {

    public static void main(String[] args) {

        double currentTemp = 39.5;

        Predicate<Double> highTempAlert = temp -> temp > 37.0;

        if (highTempAlert.test(currentTemp)) {
            System.out.println("⚠️ Alert: High Temperature!");
        } else {
            System.out.println("Temperature is normal");
        }
    }
}
