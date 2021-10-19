package twoSum;

/*
Given an array of integers, 'nums', and an integer, 'target', return indices of the two numbers such that they add up to 'target'.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

class Solution {
    public int[] twoSumAlgo(int[] nums, int target) {
        // Create a new array with a length of 2
        int[] a = new int[2];
        // Iterate through the 'nums' array
        for (int i = 0; i < nums.length; i++) {
            /* Iterate through every value after nums[i] & add the value with nums[i] and if the two values summed equals the 'target' value, insert nums[i] 
            & nums[j] into the new array and return it */
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
}