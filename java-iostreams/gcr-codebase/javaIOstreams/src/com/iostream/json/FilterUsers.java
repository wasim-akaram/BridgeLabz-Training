package com.iostream.json;
public class FilterUsers {
    public static void main(String[] args) {

        String json =
            "[ { \"name\": \"Rahul\", \"age\": 22 }, " +
            "{ \"name\": \"Amit\", \"age\": 28 } ]";

        String[] users = json.split("\\{");

        for (String u : users) {
            if (u.contains("age")) {
                int age = Integer.parseInt(
                        u.replaceAll("[^0-9]", "")
                );
                if (age > 25) {
                    System.out.println("{ " + u.trim());
                }
            }
        }
    }
}
