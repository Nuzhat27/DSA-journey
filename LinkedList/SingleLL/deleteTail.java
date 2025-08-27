package LinkedList.singleLL;
//Delete the tail of single linkedlist
class deleteTail{
	public ListNode deleteTailSLL(ListNode head){
		ListNode current = head ;
		if(head == null || head.next == null)return null;
		while(current.next.next != null ){
			current = current.next;
		}
		current.next = null;
		return head;
	}
}