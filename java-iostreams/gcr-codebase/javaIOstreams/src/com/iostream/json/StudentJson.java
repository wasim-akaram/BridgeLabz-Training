package com.iostream.json;
import java.util.*;

public class StudentJson 
{
    public static void main(String[] args) 
    {

        String name = "Rico";
        int age = 22;
        List<String> subjects = Arrays.asList("Maths", "Physics", "CS");

        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("  \"name\": \"").append(name).append("\",\n");
        json.append("  \"age\": ").append(age).append(",\n");
        json.append("  \"subjects\": [");

        for (int i = 0; i < subjects.size(); i++) 
        {
            json.append("\"").append(subjects.get(i)).append("\"");
            if (i < subjects.size() - 1) 
            {
                json.append(", ");
            }
        }

        json.append("]\n");
        json.append("}");

        System.out.println(json.toString());
    }
}
