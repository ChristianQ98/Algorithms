package mergeSortedArray;

public class mergeSortedArrayTest {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        Solution test2 = new Solution();
        Solution test3 = new Solution();
        Solution test4 = new Solution();

        int[] arrA1 = {1, 2, 3, 0, 0, 0};
        int[] arrA2 = {2, 5, 6};

        int[] arrB1 = {1};
        int[] arrB2 = {};

        int[] arrC1 = {0};
        int[] arrC2 = {1};

        int[] arrD1 = {4, 5, 6, 0, 0, 0};
        int[] arrD2 = {1, 2, 3};

        System.out.println(java.util.Arrays.toString(test1.merge(arrA1, 3, arrA2, 3)));
        System.out.println(java.util.Arrays.toString(test2.merge(arrB1, 1, arrB2, 0)));
        System.out.println(java.util.Arrays.toString(test3.merge(arrC1, 0, arrC2, 1)));
        System.out.println(java.util.Arrays.toString(test4.merge(arrD1, 3, arrD2, 3)));
    }
}