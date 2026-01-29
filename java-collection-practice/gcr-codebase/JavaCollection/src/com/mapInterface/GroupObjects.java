package com.mapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupObjects {
	public static void main(String[] args) 
	{

        List<Objects> employees = Arrays.asList(
            new Objects("Alex", "HR"),
            new Objects("Marty", "IT"),
            new Objects("Rico", "HR")
        );

        Map<String, List<Objects>> map = new HashMap<>();

        for (Objects emp : employees) {
            map.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
               .add(emp);
        }

        map.forEach((dept, empList) -> {
            System.out.println(dept + " : " +
                empList.stream().map(Objects::getName).toList());
        });
    }
}