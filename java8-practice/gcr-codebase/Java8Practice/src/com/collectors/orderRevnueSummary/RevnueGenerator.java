package com.collectors.orderRevnueSummary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RevnueGenerator 
{

	 public static void main(String[] args) 
	 {

	        List<Customer> orders = List.of(
	                new Customer("Alice", 250.0),
	                new Customer("Bob", 150.0),
	                new Customer("Alice", 300.0)
	        );

	        Map<String, Double> revenuePerCustomer =  orders.stream().collect(Collectors.groupingBy(Customer::getCustomer,
	                                Collectors.summingDouble(Customer::getAmount)  ));

	        System.out.println(revenuePerCustomer);
	    }
	}