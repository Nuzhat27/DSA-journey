package LinkedList.SingleLL;
//Insert at the tail of the single LL
class insertAtTail{
	public ListNode insert(ListNode head , int X){
		ListNode newNode = new ListNode(X);
		ListNode current = head;
		if(head == null || head.next == null){
			return newNode;
		}
		while(current.next != null ){
			current = current.next;
		}
		current.next = newNode;
		return head;
	}
}