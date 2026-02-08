package com.iostream.json;
public class FilterByAge 
{
    public static void main(String[] args) 
    {

        String json =
            "[ { \"name\": \"Vipin\", \"age\": 22 }, " +
            "{ \"name\": \"Vishal\", \"age\": 28 } ]";

        String[] objects = json.split("\\{");

        for (String obj : objects) {
            if (obj.contains("age")) {
                String agePart = obj.split("age")[1];
                int age = Integer.parseInt(
                        agePart.replaceAll("[^0-9]", "")
                );

                if (age > 25) {
                    System.out.println("{ " + obj.trim());
                }
           
            }
       
        }
    }
}
