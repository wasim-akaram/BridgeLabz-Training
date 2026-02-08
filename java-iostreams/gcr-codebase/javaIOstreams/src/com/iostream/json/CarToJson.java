package com.iostream.json;
class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

public class CarToJson {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 2023);

        String json =
                "{\n" +
                "  \"brand\": \"" + car.brand + "\",\n" +
                "  \"year\": " + car.year + "\n" +
                "}";

        System.out.println(json);
    }
}
