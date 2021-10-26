package searchInsertPosition;

public class searchInsertPositionTest {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        Solution test2 = new Solution();
        Solution test3 = new Solution();
        Solution test4 = new Solution();
        Solution test5 = new Solution();

        int[] nums1 = {1, 3, 5, 6};
        int[] nums2 = {1, 3, 5, 6};
        int[] nums3 = {1, 3, 5, 6};
        int[] nums4 = {1, 3, 5, 6};
        int[] nums5 = {1};

        System.out.println(test1.searchInsert(nums1, 5));
        System.out.println(test2.searchInsert(nums2, 2));
        System.out.println(test3.searchInsert(nums3, 7));
        System.out.println(test4.searchInsert(nums4, 0));
        System.out.println(test5.searchInsert(nums5, 0));
    }
}
