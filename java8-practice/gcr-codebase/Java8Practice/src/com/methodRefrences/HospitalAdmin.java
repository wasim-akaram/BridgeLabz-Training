package com.methodRefrences;
import java.util.*;

public class HospitalAdmin 
{

    public static void main(String[] args) 
    {

        List<String> patientIds = Arrays.asList(
            "PID001",
            "PID002",
            "PID003",
            "PID004"
        );

        // Print all patient IDs using method reference
        patientIds.forEach(System.out::println);
    }
}
