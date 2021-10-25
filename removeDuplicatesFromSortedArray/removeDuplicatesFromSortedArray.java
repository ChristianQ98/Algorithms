package removeDuplicatesFromSortedArray;

/*

Given an integer array, 'nums' ,sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.

The relative order of the elements should be kept the same. Since it is impossible to change the length of the array in some languages, 

you must instead have the result be placed in the first part of the array, 'nums'. More formally, if there are 'k' elements after removing the duplicates, 

then the first 'k' elements of 'nums' should hold the final result. It does not matter what you leave beyond the first 'k' elements.

Return 'k' after placing the final result in the first 'k' slots of 'nums'.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

*/

class Solution {
    public int removeDuplicates(int[] nums) {
        // Variable to keep track of the number of non-duplicate values in the array
        // Used to place the index non-duplicate values ahead of duplicate values in the array
        int j = 1;
        for(int i = 1; i < nums.length; i++) {
            // If the current number is NOT equal to the number before it...
            if(nums[i] != nums[i - 1]) {
                // Place the current number at its appropriate index, which is ahead of any duplicate values, if any
                nums[j] = nums[i];
                // Increment j so that we can keep track of how many non-duplicate values we have so far
                j++;
            }
        } return j;
    }
}