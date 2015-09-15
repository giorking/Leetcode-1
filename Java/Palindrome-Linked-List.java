/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode FindMid(ListNode head) {
        if (head == null) return head;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head) {
        if (head == null) return head;
        ListNode cur = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = cur;
            cur = head;
            head = temp;
        }
        return cur;
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode mid = FindMid(head);
        ListNode cur = mid.next;
        mid.next = null;
        cur = reverse(cur);
        while (cur != null && head != null) {
            if (cur.val != head.val) return false;
            cur = cur.next;
            head = head.next;
        }
        return true;
    }
}