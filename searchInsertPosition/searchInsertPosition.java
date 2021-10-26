package searchInsertPosition;

/*

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        // Iterate through the nums array
        for(int i = 0; i < nums.length; i++) {
            // If the current index's value is equal to the target's value...
            if(nums[i] == target) {
                // Return the index position
                return i;
            } 
            // If the current index's value is greater than the target's value...
            else if(nums[i] > target) {
                // Return the index position because that is the position the target would be located if it were to be in the 'nums' array
                return i;
            }
            // If the target is greater than all the values in the 'nums' array, return the length of the array
            // because that is where the target value would be located if it were to be in the 'nums' array
        } return nums.length;
    }
}