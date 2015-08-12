/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode helper(ListNode l1, ListNode l2, int res) {
        if (l1 == null && l2 == null && res == 0) {
            return null;
        }
        int cur = res;
        if (l1 != null) {
            cur += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            cur += l2.val;
            l2 = l2.next;
        }
        ListNode node = new ListNode(cur % 10);
        node.next = helper(l1, l2, cur / 10);
        return node;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return helper(l1, l2, 0);
    }
}