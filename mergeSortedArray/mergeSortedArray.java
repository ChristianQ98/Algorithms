package mergeSortedArray;

/*

You are given two integer arrays, 'nums1' and 'nums2', sorted in non-decreasing order, and two integers, 'm' and 'n', representing the 

number of elements in 'nums1' and 'nums2' respectively.

Merge 'nums1' and 'nums2' into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array 'nums1'. To accommodate this, 

'nums1' has a length of 'm' + 'n', where the first 'm' elements denote the elements that should be merged, and the last 'n' elements are set 

to 0 and should be ignored. 'nums2' has a length of 'n'.

*/

class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // Merge the values of the nums2 array to the end of the nums1 array
        for(int i = 0; i < nums2.length; i++) {
            nums1[nums1.length - i - 1] = nums2[i];
        }
        // Iterate through the entire nums1 array, besides the final index
        for(int j = 0; j < nums1.length - 1; j++) {
            // If the current index's value is greater than the next index's value...
            if(nums1[j] > nums1[j + 1]) {
                // Store the current index's value in a temporary variable
                int temp = nums1[j];
                // Replace the current index's value with the next index's value
                nums1[j] = nums1[j + 1];
                // Replace the next index's value with the current index's previous value, which was stored in the temp variable
                nums1[j + 1] = temp;
                // If we are past the first index in the iteration/loop...
                if(j > 0) {
                    // Go back two iterations in order to compare the current index's value with the previous index's values
                    j = j - 2;
                }
            }
        }
        // Return the nums1 array, which is now sorted in ascending/non-decreasing order
        return nums1;
    }
}