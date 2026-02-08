package com.iostream.json;
public class MergeJson 
{
    public static void main(String[] args) 
    {

        String json1 = "{ \"name\": \"Rahul\" }";
        String json2 = "{ \"age\": 22 }";

        String merged =
                "{ \"name\": \"Rahul\", \"age\": 22 }";

        System.out.println(merged);
    }
}
