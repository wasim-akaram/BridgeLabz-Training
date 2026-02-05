package com.streamAPI.insuranceClaimAnalysis;
import java.util.*;
import java.util.stream.*;

public class InsuranceClaimAnalysis 
{

    public static void main(String[] args) 
    {

        List<Insurance> claims = Arrays.asList(
            new Insurance("Health", 50000),
            new Insurance("Health", 70000),
            new Insurance("Vehicle", 30000),
            new Insurance("Vehicle", 45000),
            new Insurance("Life", 100000),
            new Insurance("Life", 150000)
        );

    
        Map<String, Double> averageClaimAmount = claims.stream()
                      .collect(Collectors.groupingBy( c -> c.type,
                          Collectors.averagingDouble(c -> c.amount)));

        
        averageClaimAmount.forEach((type, avgAmount) -> System.out.println(type + " Average Claim Amount: " + avgAmount));
    }
}
