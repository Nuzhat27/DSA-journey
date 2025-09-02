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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode kthNode;
        ListNode prevNode = null;
        ListNode nextNode;

        ListNode temp = head;

        while(temp != null){
            kthNode = findKthNode(temp , k);
            if(kthNode != null){
                nextNode = kthNode.next;
                kthNode.next= null;
                reverse(temp);
                if(temp == head){
                    head = kthNode;
                }
                else{
                    prevNode.next = kthNode;
                }
                prevNode = temp;
                temp = nextNode;
            }
            else{
                if(prevNode != null){
                    prevNode.next = temp;
                }
                break;
            }
        }
        return head;
    }
    public ListNode reverse(ListNode head){
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
    public ListNode findKthNode(ListNode temp , int k){
        k -= 1;
        while(temp != null && k > 0){
            temp = temp.next;
            k--;
        }
        return temp;
    }
}