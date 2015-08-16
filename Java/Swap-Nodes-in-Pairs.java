/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = new ListNode(0), cur = pre;
        while (head != null && head.next != null) {
            ListNode temp = head.next.next;
            pre.next = head.next;
            pre = pre.next;
            pre.next = head;
            pre = pre.next;
            head = temp;
        }
        pre.next = head;
        return cur.next;
    }
}