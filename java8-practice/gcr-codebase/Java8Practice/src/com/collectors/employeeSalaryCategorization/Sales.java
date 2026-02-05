package com.collectors.employeeSalaryCategorization;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sales 
{
	public static void main(String [] args)
	{
		
		List<Employee> employees = List.of(
                new Employee("Wasim","IT", 60000),
                new Employee("Vipin","IT", 70000),
                new Employee("Gufran","HR", 40000),
                new Employee("Anvesh","HR", 50000),
                new Employee("Harshit","Finance", 72000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        avgSalaryByDept.forEach((dept, avg) ->
                System.out.println(dept + " -> " + avg)
        );
    }
}