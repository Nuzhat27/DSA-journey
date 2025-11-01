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
        Set<Integer> toRemove = new HashSet<>();
        for(int n : nums){
            toRemove.add(n);
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null) {
            if (toRemove.contains(curr.next.val)) {
                curr.next = curr.next.next; // Skip the node
            } else {
                curr = curr.next; // Move forward
            }
        }

        return dummy.next;
    }
}