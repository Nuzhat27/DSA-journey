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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head == null) return null;
        Set<Integer> num = new HashSet<>();
        for(int n : nums){
            num.add(n);
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode back = dummy;
        ListNode curr = head;
        while(curr != null){
            if(num.contains(curr.val)){
                back.next = curr.next;
            }
            else back = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}