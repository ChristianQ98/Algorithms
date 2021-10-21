package mergeTwoSortedLists;

import mergeTwoSortedLists.Solution.ListNode;

public class mergeTwoSortedListsTest {
    public static void main(String[] args) {
        // Create a new test case
        Solution test1 = new Solution();
        // Create the first list for the test case
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        // Create the second list for the test case
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        System.out.println(test1.mergeTwoLists(l1, l2));
    }
}
