/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.




link: https://leetcode.com/problems/two-sum/description/

*/

class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    
        
    
{
        int index1=0;
        int index2 =0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    index1 = i;
                    index2 = j;
                }
            }
        }
        int arr[] = {index1, index2};
        return arr;
    }

   
}