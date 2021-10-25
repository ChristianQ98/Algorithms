package removeElement;

/* 

Given an integer array, 'nums', and an integer, 'val', remove all occurrences of 'val' in 'nums' in-place. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array 'nums'. 
More formally, if there are k elements after removing the duplicates, then the first k elements of 'nums' should hold the final result. It does not matter what 
you leave beyond the first k elements.

Return k after placing the final result in the first k slots of 'nums'.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

*/

class Solution {
    public int removeElement(int[] nums, int val) {
        // Start at the first index in the array
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            // If the current number is not equal to the value...
            if(nums[i] != val) {
                // Place the current value where the j index currently is
                nums[j] = nums[i];
                j++;
            }
        } return j; 
    }
}