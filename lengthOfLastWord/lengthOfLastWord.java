package lengthOfLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        // The count variable is used to count letters in a row with no spaces & is used as a temp variable/placeholder
        int count = 0;
        int finalCount = 0;
        // Convert the string to a character array so we can check if each character is a space character or not
        char[] sChar = s.toCharArray();
        for(int i = 0; i < sChar.length; i++) {
            // If the current character is not a space character...
            if(sChar[i] != ' ') {
                // Iterate the count variable and then assign the value to the finalCount variable
                count++;
                finalCount = count;
            } 
            // If the current variable is a space character...
            else {
                // Reset the count variable back to 0
                count = 0;
                // The finalCount variable will remain the same as it was before, it does NOT get reset
                // This is because if the end of the string contains spaces, we simply ignore the spaces and just return the length of the 
                // final word in the string
            }
        } return finalCount;
    }
}