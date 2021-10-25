package removeDuplicatesFromSortedArray;

public class removeDuplicatesFromSortedArrayTest {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        Solution test2 = new Solution();

        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(test1.removeDuplicates(nums1));
        System.out.println(test2.removeDuplicates(nums2));
    }
}
