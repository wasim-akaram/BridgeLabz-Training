package com.collectors.studentResult;
import java.util.*;
import java.util.stream.Collectors;

public class StudentGrouping 
{
    public static void main(String[] args) 
    {

        List<Student> students = List.of(
                new Student("Rico", "A"),
                new Student("Skipper", "B"),
                new Student("Mort", "c"),
                new Student("Private", "A+")
        );

        Map<String, List<String>> result =students.stream().collect(Collectors.groupingBy(Student::getGrade,
                                Collectors.mapping(Student::getName, Collectors.toList()) ));

        System.out.println(result);
    }
}
