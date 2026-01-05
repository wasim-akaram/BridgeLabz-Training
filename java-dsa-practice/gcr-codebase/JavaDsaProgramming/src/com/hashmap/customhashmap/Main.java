package com.hashmap.customhashmap;



public class Main {
    public static void main(String[] args) 
    {

        CustomHashMap<Integer, String> map = new CustomHashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(17, "Seventeen"); // Collision (if capacity = 16)

        System.out.println(map.get(1));   // One
        System.out.println(map.get(17));  // Seventeen

        map.remove(2);
        System.out.println(map.get(2));   // null
    }
}
