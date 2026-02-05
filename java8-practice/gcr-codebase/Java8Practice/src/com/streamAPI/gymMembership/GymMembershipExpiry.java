package com.streamAPI.gymMembership;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class GymMembershipExpiry 
{

    public static void main(String[] args) 
    {

        List<Member> members = Arrays.asList(
            new Member("Alex", LocalDate.now().plusDays(10)),
            new Member("Mort", LocalDate.now().plusDays(40)),
            new Member("Julien", LocalDate.now().plusDays(25)),
            new Member("Vipin", LocalDate.now().plusDays(5)),
            new Member("Vishal", LocalDate.now().plusDays(60))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon = members.stream()

            .filter(m -> !m.expiryDate.isBefore(today) &&
                 m.expiryDate.isBefore(next30Days)
            )
            .collect(Collectors.toList());

    
        expiringSoon.forEach(System.out::println);
    }
}
