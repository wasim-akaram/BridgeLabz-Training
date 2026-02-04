package com.lambdaExpression.notificationFiltering;
import java.util.*;

import java.util.function.Predicate;

public class HospitalAlerts 
{

    public static void main(String[] args) 
    {

        List<Alert> alerts = Arrays.asList(
            new Alert("CRITICAL", "Heart rate abnormal"),
            new Alert("MEDICATION", "Take insulin at 8 PM"),
            new Alert("APPOINTMENT", "Doctor visit tomorrow"),
            new Alert("CRITICAL", "Low oxygen level")
        );

        // User preference: show only CRITICAL alerts
        Predicate<Alert> criticalAlerts = alert -> alert.type.equals("CRITICAL");

        System.out.println("Showing critical alerts:");
        filterAlerts(alerts, criticalAlerts);

        // User preference: show MEDICATION alerts
        Predicate<Alert> medicationAlerts = alert -> alert.type.equals("MEDICATION");

        System.out.println("\nShowing medication alerts:");
        filterAlerts(alerts, medicationAlerts);
    }

    // Generic filter method
    static void filterAlerts(List<Alert> alerts, Predicate<Alert> condition) 
    {
        for (Alert alert : alerts) 
        {
            if (condition.test(alert)) 
            {
                System.out.println(alert);
            }
        }
    }
}
