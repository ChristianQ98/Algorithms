package implementStrStr;

/*

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

*/

class Solution {
    public int strStr(String haystack, String needle) {
        // Return 0 if needle is an empty string
        if(needle.equals("")) {
            return 0;
        }
        // If the haystack contains the needle's string...
        if(haystack.contains(needle)) {
            // Return the starting index where the string is found
            return haystack.indexOf(needle);
        } 
        // If the needle's string is not found in the haystack, return -1
        else {
            return -1;
        }
    }
}