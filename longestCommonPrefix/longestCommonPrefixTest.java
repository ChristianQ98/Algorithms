package longestCommonPrefix;

public class longestCommonPrefixTest {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        Solution test2 = new Solution();

        String[] string1 = {"Flower", "Flow", "Flight"};
        String[] string2 = {"dog","racecar","car"};
        
        System.out.println(test1.longestCommonPrefix(string1));
        System.out.println(test2.longestCommonPrefix(string2));
    }
}
