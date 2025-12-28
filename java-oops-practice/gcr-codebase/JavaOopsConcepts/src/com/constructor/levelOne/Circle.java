package com.constructor.levelOne;

public class Circle 
{
	private double radius;

    // Default constructor
    public Circle() 
    {
        this(1.0); // Calls the parameterized constructor with default radius
    }

    // Parameterized constructor
    public Circle(double radius) 
    {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() 
    {
        return radius;
    }

    // Method to calculate area
    public double calculateArea() 
    {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double findCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle Radius: " + defaultCircle.getRadius());
        System.out.println("Default Circle Area: " + defaultCircle.calculateArea());
        System.out.println("Default Circle Circumference: " + defaultCircle.findCircumference());

        Circle customCircle = new Circle(5.0);
        System.out.println("Custom Circle Radius: " + customCircle.getRadius());
        System.out.println("Custom Circle Area: " + customCircle.calculateArea());
        System.out.println("Custom Circle Circumference: " + customCircle.findCircumference());
    }
}
