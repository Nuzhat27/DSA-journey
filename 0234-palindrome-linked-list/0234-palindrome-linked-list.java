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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = head;
        ListNode secondHead = reverseList(slow);
        ListNode temp2 = secondHead;
        while(temp2 != null){
            if(temp.val != temp2.val){
                reverseList(secondHead);
                return false;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        reverseList(secondHead);
        return true;
    }
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null)return head;
        ListNode temp = head;
        ListNode front;
        ListNode back = null;
        while(temp != null){
            front = temp.next;
            temp.next = back;
            back = temp;
            temp = front;
        }
        return back;
    }
}