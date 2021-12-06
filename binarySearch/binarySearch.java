package binarySearch;

public class binarySearch {
    public int search(int[] nums, int target) {
        // Sort the array
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                if(i > 0) {
                    i -= 2; 
                }
            }
        }
        // Implement binary search
        int low = nums[0];
        int high = nums[nums.length - 1];
        int result = 0;
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            if(nums[mid] < target) {
                low = mid + 1;
            } 
            else if(nums[mid] > target) {
                high = mid - 1;
            }
            else if(nums[mid] == target) {
                result = mid;
                break;
            }
        } return result;
    }
}
