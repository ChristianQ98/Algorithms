package plusOne;

/*

You are given a large integer represented as an integer array, 'digits', where each 'digits[i]'' is the 'ith' digit of the integer. 

The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

*/

class Solution {
    public int[] plusOne(int[] digits) {
        // Start at the end of the digits array and go through every digit in the array reversed
        for(int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9...
            if(digits[i] < 9) {
                // Increment it by 1
                digits[i]++;
                return digits;
            }
            // If the current digit is a 9, set it to 0
            digits[i] = 0;
        }
        // If 'digits' does not get returned (from line 21) because we encountered a case where the array had 9s at the end, leading to the array containing all 0s,
        // make a new array with all 0s besides the 0 index, which will be 1
        // Example: [9, 9, 9] will be [0, 0, 0] up until now, and then will become [1, 0, 0, 0]
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
