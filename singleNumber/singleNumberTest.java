package singleNumber;

public class singleNumberTest {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        Solution test2 = new Solution();
        Solution test3 = new Solution();
        Solution test4 = new Solution();

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};
        int[] nums4 = {1, 0, 1};

        System.out.println(test1.singleNumber(nums1));
        System.out.println(test2.singleNumber(nums2));
        System.out.println(test3.singleNumber(nums3));
        System.out.println(test4.singleNumber(nums4));
    }
}