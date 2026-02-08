package com.iostream.json.userObject;
 import java.util.*;
public class ListToJson {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Rahul", 22),
                new User("Amit", 28)
        );

        StringBuilder json = new StringBuilder("[\n");

        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            json.append("  { \"name\": \"")
                .append(u.name)
                .append("\", \"age\": ")
                .append(u.age)
                .append(" }");

            if (i < users.size() - 1) json.append(",");
            json.append("\n");
        }
        json.append("]");

        System.out.println(json);
    }
}
