/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = slow, curr = slow.next, currNext = slow;
        slow.next = null;
        while(curr!=null){
            currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }
        curr = head;
        while(prev.next!=null){
            ListNode temp  = curr.next;
            ListNode prevNext = prev.next;
            curr.next = prev;
            prev.next = temp;
            prev = prevNext;
            curr = temp;
        }
    }
}
