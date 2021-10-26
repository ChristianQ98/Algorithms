package implementStrStr;

public class implementStrStrTest {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        Solution test2 = new Solution();
        Solution test3 = new Solution();

        String haystack1 = "hello";
        String needle1 = "ll";

        String haystack2 = "aaaaa";
        String needle2 = "bba";

        String haystack3 = "";
        String needle3 = "";

        System.out.println(test1.strStr(haystack1, needle1));
        System.out.println(test2.strStr(haystack2, needle2));
        System.out.println(test3.strStr(haystack3, needle3));
    }
}
