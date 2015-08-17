/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode pre = new ListNode(0), cur = pre;
        while (head != null) {
            ListNode temp = head.next;
            cur = pre;
            while (cur.next != null && cur.next.val < head.val) {
                cur = cur.next;
            }
            ListNode pnext = cur.next;
            cur.next = head;
            head.next = pnext;
            head = temp;
        }
        return pre.next;
    }
}