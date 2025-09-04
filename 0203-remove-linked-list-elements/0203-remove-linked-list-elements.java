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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode back = null;
        ListNode front;
        while(temp != null){
            front = temp.next;
            if(temp.val == val){
                if(temp == head)head = head.next;
                else{
                    if(front != null && back != null){
                        back.next = front;
                    }else{
                        if(back != null)back.next = null;
                    }
                }
            }
            if(temp.val != val)back = temp; 
            temp = temp.next;
        }
        return head;
    }
}