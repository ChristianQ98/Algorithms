package lengthOfLastWord;

public class lengthOfLastWordTest {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        Solution test2 = new Solution();
        Solution test3 = new Solution();

        String word1 = "Hello World";
        String word2 = "   fly me   to   the moon  ";
        String word3 = "luffy is still joyboy";

        System.out.println(test1.lengthOfLastWord(word1));
        System.out.println(test2.lengthOfLastWord(word2));
        System.out.println(test3.lengthOfLastWord(word3));
    }
}
