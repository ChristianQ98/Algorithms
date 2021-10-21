package mergeTwoSortedLists;

/* 

Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

*/

class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a temporary variable in order to create a brand new list
        ListNode temp = new ListNode(-1);
        // Store the temporary variable
        ListNode current = temp;
        // As long as both lists have values, continue iterating through both lists
        while (l1 != null && l2 != null) {
            // If list 1's current value is less than list 2's current value...
            if (l1.val < l2.val) {
                // Add list 1's current value to the end of the new list
                temp.next = l1;
                // Shift over to the next value in list 1 so that it can be used on the next iteration of the while-loop
                l1 = l1.next;
            } 
            // If list 2's current value is less than list 1's current value...
            else {
                // Add list 2's current value to the end of the new list
                temp.next = l2;
                // Shift over to the next value in list 2 so that it can be used on the next iteration of the while-loop
                l2 = l2.next;
            }
            // Shift over to the next index in the new list
            temp = temp.next;
        }
        // Once the while-loop ends, that means that either one or both of the lists do not have any more values to iterate through
        
        // If list 1 still has any values, but list 2 does not...
        if(l1 != null) {
            // Add the remaining list 1 values to the end of the new list
            temp.next = l1;
        }
        // If list 2 still has any values, but list 1 does not...
        if(l2 != null) {
            // Add the remaining list 2 values to the end of the new list
            temp.next = l2;
        }
        // Return the new list, excluding the initial temp variable, which was -1, that we provided to create the list
        return current.next;
    }
}