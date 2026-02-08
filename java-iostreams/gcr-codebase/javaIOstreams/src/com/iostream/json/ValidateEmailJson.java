package com.iostream.json;
import java.util.regex.*;

public class ValidateEmailJson {
    public static void main(String[] args) {

        String json = "{ \"email\": \"test@gmail.com\" }";
        String email = json.split(":")[1]
                           .replace("\"", "")
                           .replace("}", "")
                           .trim();

        boolean valid = Pattern
                .compile("^[A-Za-z0-9+_.-]+@(.+)$")
                .matcher(email)
                .matches();

        System.out.println(valid ? "Valid Email" : "Invalid Email");
    }
}
