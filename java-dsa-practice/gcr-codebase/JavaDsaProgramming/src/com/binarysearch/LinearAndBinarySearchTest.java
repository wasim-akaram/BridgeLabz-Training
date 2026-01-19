package com.binarysearch;
import java.util.Arrays;

public class LinearAndBinarySearchTest 
{

    
    public static int findFirstMissingPositive(int[] nums) 
    {
        int n = nums.length;

        boolean[] visited = new boolean[n + 1];

        // Mark existing positive numbers
        for (int num : nums) 
        {
            if (num > 0 && num <= n) 
            {
                visited[num] = true;
            }
        }

        // Find first missing positive
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return n + 1;
    }

    
    public static int binarySearch(int[] nums, int target) 
    {
        Arrays.sort(nums); 

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) 
            {
                return mid;
            } 
            else if (nums[mid] < target) 
            {
                left = mid + 1;
            } 
            else
            {
                right = mid - 1;
            }
        }
        return -1;
    }

 
    public static void main(String[] args) 
    {

        int[] arr = {3, 4, -1, 1, 7};
        int target = 4;

        // Linear Search Test
        int missing = findFirstMissingPositive(arr);
        System.out.println("First Missing Positive Integer: " + missing);

        // Binary Search Test
        int index = binarySearch(arr, target);
        System.out.println("Index of target " + target + " after sorting: " + index);

      
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
