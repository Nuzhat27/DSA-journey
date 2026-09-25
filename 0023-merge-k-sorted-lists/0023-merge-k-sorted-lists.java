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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        for(int i = 1; i < lists.length ; i ++){
            lists[i] = mergeLL(lists[i], lists[i - 1]);
        }
        return lists[lists.length - 1];
    }
    public ListNode mergeLL(ListNode l1 , ListNode l2){
        ListNode dummyNode = new ListNode();
        ListNode temp = dummyNode;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 != null){
            temp.next = l1;
        }
        if(l2 != null){
            temp.next = l2;
        }
        return dummyNode.next;
    }
}