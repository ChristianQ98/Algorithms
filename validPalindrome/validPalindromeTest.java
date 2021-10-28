package validPalindrome;

public class validPalindromeTest {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        Solution test2 = new Solution();
        Solution test3 = new Solution();

        System.out.println(test1.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(test2.isPalindrome("race a car"));
        System.out.println(test3.isPalindrome(""));
    }
}
