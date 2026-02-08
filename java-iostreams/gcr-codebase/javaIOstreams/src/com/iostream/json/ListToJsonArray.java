package com.iostream.json;
import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToJsonArray {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Rahul", 22),
                new Student("Amit", 28)
        );

        StringBuilder json = new StringBuilder("[\n");

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            json.append("  { \"name\": \"")
                .append(s.name)
                .append("\", \"age\": ")
                .append(s.age)
                .append(" }");

            if (i < students.size() - 1)
                json.append(",");

            json.append("\n");
        }
        json.append("]");

        System.out.println(json);
    }
}
