package validPalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        // If the string is an empty string, immediately return true because it is a palindrome
        if(s.equals("")) {
            return true;
        }
        // Convert the string into a char array so we can iterate through every character in the string
        char[] newArr = s.toCharArray();
        // Create an empty string where we will store the iteration of the char array going forwards
        String forward = "";
        // Iterate through the entire char array forward
        for(int i = 0; i < newArr.length; i++) {
            // If the current character is a letter or a number, add it to the new 'forward' string
            if(Character.isLetterOrDigit(newArr[i])) {
                forward += newArr[i];
            }
        }
        // Convert all the characters in the 'forward' string to lowercase and remove all spaces so that it is one word all together
        forward = forward.toLowerCase().replaceAll("\\s", "");
        // Create an empty string where we will store the iteration of the char array going backwards
        String backward = "";
        // Iterate through the entire char array backward
        for(int i = newArr.length - 1; i >= 0; i--) {
            // If the current character is a letter or a number, add it to the new 'backward' string
            if(Character.isLetterOrDigit(newArr[i])) {
                backward += newArr[i];
            }
        }
        // Convert all the characters in the 'backward' string to lowercase and remove all spaces so that it is one word all together
        backward = backward.toLowerCase().replaceAll("\\s", "");
        // If 'forward' & 'backward' are the same, return true
        // If 'forward' & 'backward' are NOT the same, return false
        return forward.equals(backward);
    }
}