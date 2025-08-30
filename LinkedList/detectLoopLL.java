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

class detectLoopLL {
    public boolean hasCycle(ListNode head) {
        //Brute Force = Hashing
		/*if(head == null || head.next == null)return false;
        ListNode temp = head;
        HashMap<ListNode , Integer> list = new HashMap<>();
        while(temp != null){
            if(list.containsKey(temp))return true;
            list.put(temp,1);
            temp = temp.next;
        }
        return false;
		*/
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next ;
			
			if(fast == slow)return true;
			
		}
		return false;
    }
}