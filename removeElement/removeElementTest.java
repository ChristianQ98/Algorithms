package removeElement;

public class removeElementTest {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        Solution test2 = new Solution();

        int[] nums1 = {3,2,2,3};
        int[] nums2 = {0,1,2,2,3,0,4,2};

        System.out.println(test1.removeElement(nums1, 3));
        System.out.println(test2.removeElement(nums2, 2));
    }
}