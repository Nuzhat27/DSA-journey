package LinkedList.SingleLL;
//Delete the element with value x
class deleteNodeValX{
	public ListNode delete(ListNode head , int X){
		ListNode current = head;
		ListNode prev = null;
		if(head == null) return null;
		if(head.val == val){
			head = head.next;
			return head;
		}
		while(current != null){
			if(current.val == X){
				prev.next = current.next;
				break;
			}
			prev = current;
			current = current.next;
		}
		return head;
	}
}