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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode kFront = head;
       ListNode kBack = head;
       
       for(int i = 1 ; i < k ; i ++){
        kFront = kFront.next;
       }

       ListNode temp = kFront;
       while(temp.next != null){
        temp = temp.next;
        kBack = kBack.next;
       }
       int t = kFront.val;
       kFront.val = kBack.val;
       kBack.val = t;
       return head; 
    }
    
}