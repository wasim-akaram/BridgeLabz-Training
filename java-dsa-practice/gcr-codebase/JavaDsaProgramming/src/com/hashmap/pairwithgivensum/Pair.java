package com.hashmap.pairwithgivensum;



import java.util.HashSet;

public class Pair {

    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println(hasPairWithSum(arr, target));
    }
}
