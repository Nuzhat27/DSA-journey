package LinkedList;
//Delete the middle node in LL
/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class deleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode back = null;
        while(fast != null && fast.next != null){
            back = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        back.next = slow.next;
        slow.next = null;
        return head;
    }
}