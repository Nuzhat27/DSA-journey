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
        if(lists.length == 0)return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(ListNode list : lists){
            if(list != null){
                pq.offer(list);
            }
        }
        ListNode dummyNode = new ListNode();
        ListNode temp = dummyNode;
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            temp.next = node;

            node = node.next;
            temp = temp.next;

            if(node != null)pq.offer(node);
        }
        return dummyNode.next;
    }

}