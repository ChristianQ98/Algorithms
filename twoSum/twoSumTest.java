package twoSum;

public class twoSumTest {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        Solution test1 = new Solution();
        // Prints [0, 1] because nums[0] + nums[1] == 10 OR 2 + 7 === 9
        System.out.println(java.util.Arrays.toString(test1.twoSumAlgo(nums1, 9)));

        int[] nums2 = {3, 2, 4};
        Solution test2 = new Solution();
        // Prints [1, 2] because nums[1] + nums[2] == 10 OR 2 + 4 === 6
        System.out.println(java.util.Arrays.toString(test2.twoSumAlgo(nums2, 6)));

        int[] nums3 = {3, 3};
        Solution test3 = new Solution();
        // Prints [0, 1] because nums[0] + nums[1] == 10 OR 3 + 3 === 6
        System.out.println(java.util.Arrays.toString(test3.twoSumAlgo(nums3, 6)));

        int[] nums4 = {4, 3, 8, 7, 15, 1, 4};
        Solution test4 = new Solution();
        // Prints [1, 3] because nums[1] + nums[3] == 10 OR 3 + 7 === 10
        System.out.println(java.util.Arrays.toString(test4.twoSumAlgo(nums4, 10)));

        int[] nums5 = {2, 1, 7, 4, 10};
        Solution test5 = new Solution();
        // Prints [0, 0] because no two values summed together add up to 15, so the default array of length 2 is returned
        System.out.println(java.util.Arrays.toString(test5.twoSumAlgo(nums5, 15)));
    }
}