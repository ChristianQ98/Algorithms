package validParenthesis;

public class validParenthesisTest {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        System.out.println(test1.isValid("()"));
        Solution test2 = new Solution();
        System.out.println(test2.isValid("()[]{}"));
        Solution test3 = new Solution();
        System.out.println(test3.isValid("(]"));
        Solution test4 = new Solution();
        System.out.println(test4.isValid("([)]"));
        Solution test5 = new Solution();
        System.out.println(test5.isValid("{[]}"));
    }
}
