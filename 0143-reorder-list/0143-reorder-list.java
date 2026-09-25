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
        //Step 1: find the middle of  LL
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //Reversing the second half of the LL
        ListNode second = slow.next;
        ListNode prev = null;
        slow.next = null;
        while(second != null){
            ListNode front = second.next;
            second.next = prev;
            prev = second;
            second = front;
        }
        //Merging the two halves
        ListNode first = head;
        second = prev;
        while(second != null){
            ListNode front1 = first.next;
            ListNode front2 = second.next;

            first.next = second;
            second.next = front1;

            first = front1;
            second = front2;
        }
    }
}