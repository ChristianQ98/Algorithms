package singleNumber;

/*

Given a non-empty array of integers, 'nums', every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

*/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        // Compare every number individually with every number in the 'nums' array
        for(int num : nums) {
            // Use the XOR operator to assign the single number to the 'result' variable
            result ^= num;
        } return result;
    }
}