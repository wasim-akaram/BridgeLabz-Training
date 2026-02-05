package com.functionalInterface.staticMethods;
interface SecurityUtils {

    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*\\d.*");
    }
}

public class PasswordCheck {

    public static void main(String[] args) {

        System.out.println(SecurityUtils.isStrongPassword("Secure123"));
        System.out.println(SecurityUtils.isStrongPassword("weak"));
    }
}
