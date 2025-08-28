package LinkedList.DoublyLL;
//Delete tail of DLL
class deleteTail{
	public ListNode delete(ListNode head){
		ListNode temp = head;
		if(head == null || head.next)return null;
		while(temp.next != null){
			temp = temp.next;
		}
		ListNode back = temp.prev;
		back.next = null;
		temp.prev = null;
		return head;
	}
}