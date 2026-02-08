package com.iostream.json;
public class ValidateJson {
    public static void main(String[] args) {

        String json = "{ \"name\": \"Amit\", \"age\": 25 }";

        boolean valid = json.startsWith("{") &&
                        json.endsWith("}") &&
                        json.contains(":");

        if (valid) {
            System.out.println("Valid JSON structure");
        } else {
            System.out.println("Invalid JSON structure");
        }
    }
}
