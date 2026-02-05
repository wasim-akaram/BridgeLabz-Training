package com.streamAPI.doctorAvailability;
import java.util.*;
import java.util.stream.*;

public class DoctorAvailability 
{

    public static void main(String[] args) 
    {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Rico", "Cardiology", false),
            new Doctor("Dr. Marty", "Neurology", true),
            new Doctor("Dr. Scrat", "Orthopedics", false),
            new Doctor("Dr. Julien", "Dermatology", true),
            new Doctor("Dr. Mort", "Neurology", true)
        );

        List<Doctor> weekendDoctors = doctors.stream()

            
            .filter(d -> d.availableOnWeekend)


            .sorted(Comparator.comparing(d -> d.specialty))

        
            .collect(Collectors.toList());

        weekendDoctors.forEach(System.out::println);
    }
}
