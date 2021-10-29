package sqrtX;

class Solution {
    public int mySqrt(int x) {
        // If x is 0 or 1, then its square root is itself, so return x
        if(x == 0 || x == 1) {
            return x;
        }
        // One is the lowest square root we could return, so that is our lowest point
        int lower = 1;
        // Our upper point is x because that is the highest number we could possibly return
        int upper = x;
        int answer = 0;
        // While the low point is less than or equal than the upper point...
        while(lower <= upper) {
            // Assign a 'middle' variable which is used to store the middle index of the array
            // (upper - lower) / 2 is used to prevent an overflow from occuring, in the case that we are dealing with an extremely large array
            int middle = lower + (upper - lower) / 2;
            // If the 'middle' variable's value multiplied by itself is equal to 'x', we return 'middle' because it is the square root of 'x'
            if(middle * middle == x) {
                return middle;
            }
            // If 'middle' is greater than or equal to 'x' divided by 'middle', 'upper' becomes 'middle' - 1
            if(middle >= x / middle) {
                upper = middle - 1;
            }
            // If 'middle' is less than or equal to 'x' divided by 'middle', 'lower' becomes 'middle' + 1
            if(middle <= x / middle) {
                lower = middle + 1;
                // The 'answer' variable becomes middle
                answer = middle;
            }
        } return answer;
    }
}