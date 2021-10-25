package longestCommonPrefix;

/*

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

*/

class Solution {
    public String longestCommonPrefix(String[] str) {
        // If the array is empty, return an empty string
        if(str.length == 0) {
            return "";
        }
        // Set the string to the first string in the array
        String prefix = str[0];
        // Start at the second element (first index) of the array
        for(int i = 1; i < str.length; i++) {
            // While the prefix and the current string have the same characters at the same index...
            while(str[i].indexOf(prefix) != 0) {
                // Set the prefix to the new value
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        } return prefix;
    }    
}