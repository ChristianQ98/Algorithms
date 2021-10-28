package plusOne;

public class plusOneTest {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        Solution test2 = new Solution();
        Solution test3 = new Solution();
        Solution test4 = new Solution();
        Solution test5 = new Solution();

        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {0};
        int[] digits4 = {9};
        int[] digits5 = {8, 9, 9, 9};

        System.out.println(java.util.Arrays.toString(test1.plusOne(digits1)));
        System.out.println(java.util.Arrays.toString(test2.plusOne(digits2)));
        System.out.println(java.util.Arrays.toString(test3.plusOne(digits3)));
        System.out.println(java.util.Arrays.toString(test4.plusOne(digits4)));
        System.out.println(java.util.Arrays.toString(test5.plusOne(digits5)));
    }
}
